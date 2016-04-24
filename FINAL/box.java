import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class box here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class box extends minigame2
{
    private int max = 4;
    private int nummer = 1;
    private int clicked = 0; //sets the clicked variable (used in the boxgrabbing to set the state of holding the mouse clicked or releasing it)
    private int gravity = 0; //sets the private gravity
    private int ground = 700; //sets the Y variable that will act like the ground
    public int locLocked=0;
    private int boxsize = 20;
    public int boxtype= Greenfoot.getRandomNumber(3);
    public int turnTimer = 100;
    public int state = 0;
    public int beginning=1;
    public int ending=1;
    public int truckLocked =0;
    private boolean touch = true;
    public void act() 
    {
        if(!pause.isPaused)  
    { 
        gravitymethod(); //calls the gravitymethod wich makes the physics for this box, also detects and reacts to collision when falling
        boxgrabbing(); //calls the boxgrabbing method, so the box can be grabbed by holding the click button of the mouse
        carry();
        //turnThem();
        if (beginning==1) {
            boxTypes();
            beginning=0;

        }
        
        /*if (truckLocked ==0) {       
        boxTypes();
        }*/
    } }

    public void gravitymethod() {
        //this method will set the gravity to the object
        //TO DO: checks if object is below, will stop if it's a solid
        //this method uses the variables private int clicked, gravity, ground (in the public box class extends Actor)

        //checks if the getY() is above the ground
        //if yes than it will move downwards and increases gravity by 1 (if gravity is smaller than 10)
        //else it will stop and gravity will be set to 0
        if (getY() < ground) { 
            setLocation(getX(),getY()+gravity);
            if (gravity < 10) 
            {
                gravity++;
            }
        } 
        else 
        {    setLocation(getX(), 500); gravity=0; 
            if (getRotation() >= -45 || getRotation() <= 45) 
            {
                setRotation(0);            
            } 
        }

        //collision through falling and detection
        ////checks if there is a box below this, is so, sets the gravity to 0
        Actor box1 = getOneObjectAtOffset(20, 20+gravity-1, box.class);
        Actor box2 = getOneObjectAtOffset(0, 20+gravity-1, box.class);
        Actor box3 = getOneObjectAtOffset(-20, 20+gravity-1, box.class);
        Actor box4 = getOneObjectAtOffset(-20, 20+gravity-1, box.class); 
        Actor boat = getOneObjectAtOffset(0, 20+gravity-1, boat.class); 
        Actor pier = getOneIntersectingObject( pier.class); 
        if (box1 != null || box2 != null || box3 != null || boat!= null) { gravity=0; 
            if (getOneObjectAtOffset(0, 20+gravity-1, box.class)!=null){// gooit alles om als je de onderste box container pakt
                setRotation(getRotation()+2); 
                setLocation(getX()+1,getY());
            }

        }

        if (getY()<=100){ 

            if(box1 != null || box2 != null || box3 != null || box4 != null ){
                setLocation(1,1);

            }

        }    // if a box is below, set gravity to 0

        //checks if clicked, if not, it will check if box is at edge , if so it will rotate and fall off
        if (clicked ==0) {
            if (box1 != null && box2 == null && box3 == null) { setRotation(getRotation()-2); setLocation(getX()-1,getY());}
            if (box1 == null && box2 == null && box3 != null) { setRotation(getRotation()+2); setLocation(getX()+1,getY());}
        }

        if(pier!=null)// && box.getX>=465)
        {
            setLocation(getX(), pier.getY()-72);
        }

        if (isTouching(truck.class))
        {
            setRotation(0);
        }

        if (pier.class!=null)
        {
            setRotation(0);
        }
        
        if (getY()>590)
        {
            setLocation(-20, 620);
            //descoring();
            //lostMoney();
            //getWorld().removeObject(this); 
        }  

    }

   

    public void carry()
    {
        Actor truck = getOneObjectAtOffset(0, 25, truck.class);

        if (truck !=null && clicked==0)
        {
            setLocation(truck.getX()-47, truck.getY()-11); 
            if (boxtype==3){setImage("c313.png");}
            if (boxtype==2){setImage("c213.png");}
            if (boxtype==1){setImage("c123.png");}
        }
        else 
        {
            if (boxtype==3){setImage("c3.png");}
            if (boxtype==2){setImage("c2.png");}
            if (boxtype==1){setImage("c1.png");}
        }
        Actor truck1 = getOneObjectAtOffset(0, 25, truck1.class);
        Actor truck2 = getOneObjectAtOffset(0, 25, truck2.class);
        Actor truck3 = getOneObjectAtOffset(0, 25, truck3.class);
        if (truck !=null && clicked==0 && getX()>= getWorld().getWidth()-75)
        {
            if(boxtype==1 && truck2!=null)
            {

                moneyTime();
                scoring();
                getWorld().removeObject(this); 
            }
            else if(boxtype==2 && truck1!=null)
            {

                moneyTime();
                scoring();
                getWorld().removeObject(this); 
            }
            else if(boxtype==3 && truck3!=null)
            {

                moneyTime();
                scoring();
                getWorld().removeObject(this); 
            }
            else 
            {
                lostMoney();
                descoring();
                getWorld().removeObject(this);
            }
            //moneyTime();
            //scoring();

        }

    }

    public void boxgrabbing() {
        //this function checks if a box if begin grabbed or not
        //this method uses the variables private int clicked, gravity, ground

        MouseInfo mouse = Greenfoot.getMouseInfo();  //gets information from your mouse

        //this is called for when the box is being grabbed
        //checks if mouse is in the room and if clicked is equal to 1/true
        if(null != mouse && clicked==1)  {

            //checks if getY() is smaller than or is equal to ground, if true, it will setLocation to the hook
            if (getY() <= ground) {
                setLocation(mouse.getX(), mouse.getY());      } 
        }

        //checks if box is able to be clicked on, if true, it will set clicked to 1/true and gravity to 0
        if (Greenfoot.mousePressed(this)){  
            gravity=0;
            clicked=1;
        }

        //checks if box is released, if true, it will set clicked to 0
        if (Greenfoot.mouseClicked(null)){  
            clicked=0;
        }
    }

    public void boxTypes()
    {
        if (boxtype==1)  //sets the box image according to boxtype, thus sets the 0 from the random to 1
        {
            GreenfootImage[] imagearray= {
                    new GreenfootImage("c1.png"),
                    new GreenfootImage("c12.png"),
                    new GreenfootImage("c123.png"),
                    new GreenfootImage("c123.png")};  //switches back over to 1st image, so i emplied this.
            setImage(imagearray[state]);

        }
        else if (boxtype==2) //sets the box image according to boxtype, thus sets the 0 from the random to 1
        {
            GreenfootImage[] imagearray= {
                    new GreenfootImage("c2.png"),
                    new GreenfootImage("c21.png"),
                    new GreenfootImage("c213.png"),
                    new GreenfootImage("c213.png")};  //switches back over to 1st image, so i emplied this.
            setImage(imagearray[state]);

        }
        else {
            boxtype=3; //sets the box imageaccording to boxtype, thus sets the 0 from the random to 1
            if (boxtype==3){

                GreenfootImage[] imagearray= {
                        new GreenfootImage("c3.png"),
                        new GreenfootImage("c31.png"),
                        new GreenfootImage("c313.png"),
                        new GreenfootImage("c313.png")};  //switches back over to 1st image, so i emplied this.
                setImage(imagearray[state]);
            }

        }
    }

    public void turnThem()
    {
        Actor truck1 = getOneObjectAtOffset(0, 150, truck1.class);
        Actor truck2 = getOneObjectAtOffset(0, 150, truck2.class);
        Actor truck3 = getOneObjectAtOffset(0, 150, truck3.class);
        if(truck1!=null && boxtype==1 )
        {
            setImage("c113.png");
        }

        if(truck2!=null && boxtype==2 && clicked ==1 )
        {
            setImage("c213.png");
        }

        if(truck3!=null && boxtype==3 )
        {
            setImage("c313.png");
        }
    }

    /*public void setOnTruck()
    {

    if (getX()>= getWorld().getWidth()-5) 
    {
    getWorld().removeObject(this); 
    }

    else 
    {
    Actor truck1 = getOneObjectAtOffset(0, 25, truck1.class);
    if (truck1 != null&& clicked==0) 
    {
    truckLocked=1;
    boxTypes();

    if (turnTimer>1)
    {   
    setLocation(truck1.getX()-1, truck1.getY()-11);
    turnTimer--;
    if(boxtype==1)
    {

    if (turnTimer%10==0)
    {
    state++;
    }

    if(ending==1 && getX() > getWorld().getWidth()-65)
    {
    scoring();
    moneyTime();
    }
    else if (ending==1)
    {
    descoring();
    lostMoney();
    }
    }
    }
    }
    }
    Actor truck2 = getOneObjectAtOffset(0, 25, truck2.class);
    if (truck2 != null&& clicked==0) 
    {
    truckLocked=1;
    boxTypes();

    if (turnTimer>1)
    {    
    setLocation(truck2.getX()-1, truck2.getY()-11);
    turnTimer--;
    if(boxtype==2)
    {
    if (turnTimer%10==0)
    {
    state++;
    }

    if(ending==1&& getX() > getWorld().getWidth()-65)
    {
    scoring();
    moneyTime();
    }
    else if (ending==1)
    {
    descoring();
    lostMoney();
    }
    }
    }   
    }
    Actor truck3 = getOneObjectAtOffset(0, 25, truck3.class);
    if (truck3 != null&& clicked==0) 
    {
    truckLocked=1;
    boxTypes();
    if (turnTimer>1)
    {   
    setLocation(truck3.getX()-1, truck3.getY()-11);
    turnTimer--;
    if(boxtype==3)
    {
    if (turnTimer%10==0)
    {
    state++;
    }

    if(ending==1&& getX() > getWorld().getWidth()-65)
    {
    scoring();
    moneyTime();
    }
    else if (ending==1)
    {
    descoring();
    lostMoney();
    }
    }

    }

    }
    }*/

    public void scoring() 
    {
        World myWorld = getWorld();
        room mundo = (room)myWorld;
        Counter counter = mundo.getCounter();
        counter.addScore4();
        /*if (boxtype==3) {counter.addScore4();}
        if (boxtype==2) {counter.addScore4();}
        if (boxtype==1) {counter.addScore4();}
         */ending=0;
    }

    public void descoring() 
    {
        World myWorld = getWorld();
        room mundo = (room)myWorld;
        Counter counter = mundo.getCounter();
        counter.deScore4();
        /*if (boxtype==3) {counter.deScore4();}
        if (boxtype==2) {counter.deScore4();}
        if (boxtype==1) {counter.deScore4();}*/
        ending=0;
    }

    public void moneyTime()    {
        World myWorld = getWorld();
        room mundo = (room)myWorld;
        Money money = mundo.getMoney(); 
        money.addMoney4();
        /*if (boxtype == 3){money.addMoney4();}
        if (boxtype == 2){money.addMoney4();}
        if (boxtype == 1){money.addMoney4();}
         */ending=0;
    } 

    public void lostMoney(){
        World myWorld = getWorld();
        room mundo = (room)myWorld;
        Money money = mundo.getMoney();
        money.lostMoney4();
        /*if (boxtype == 3){money.lostMoney4();}
        if (boxtype == 2){money.lostMoney4();}
        if (boxtype == 1){money.lostMoney4();}
         */ ending=0;
    }

}
/*
public boolean checkTouch(Actor truck)
{
Actor truck = getOneObjectAtOffset(0, 25, truck.class);
if(checkOneTouch(truck.getX()+54, truck.getY(), a)) return true;
if(checkOneTouch(truck.getX()+14, truck.getY(), a)) return true;
if(checkOneTouch(truck.getX()-26, truck.getY(), a)) return true;
if(checkOneTouch(truck.getX()-65, truck.getY(), a)) return true;

return false;

}

public boolean checkOneTouch(int xStart, int xEnd, y, Actor a)
{
for(int x=start; x<end; x++)
{
if(getOneObjectAtOffset(x,y, a.class)!=null)
return true;
}
return false;
}

public void carryMore()
{
Actor truck = getOneObjectAtOffset(0, 25, truck.class);
Actor box = getOneObjectAtOffset(0, 25, box.class);
if (truck !=null && box !=null && clicked==0 && isTouching(box.class))
{
setLocation(truck.getX()-25, truck.getY()); 

}
}*/

