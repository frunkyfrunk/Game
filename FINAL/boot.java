import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color; 
/**
 * Write a description of class boot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boot extends everything
{
    public int beginning=1;
    public int ending=1;
    public     int timer=10;
    public     int mouseX = 900;   
    public     int mouseY = 0;
    public static int globalClicked= 0;
    private int clicked= 0;
    public int boattype= Greenfoot.getRandomNumber(3);
    public int locLocked= 0;
    public int loadtimer=100;
    public int state = 0;

    MouseInfo mouse = Greenfoot.getMouseInfo();
    /**
     * Act - do whatever the boot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()   
    {  
        
        if(!pause.isPaused)  
        { 

            // Add your action code here.

            accident();
            crash();

            if (beginning==1) {
                imageCaller();
                beginning=0;
                mouseY=getY();
            }

            locStop();

            if (locLocked ==0) {       
                control();
                imageCaller();
                if(timer<0){
                    timer = 10;
                    circlemaker();
                }
                else
                {
                    timer--;
                }

            }

        }  
    }    

    public void control(){
        if (Greenfoot.mouseClicked(null) && clicked ==1){  
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            if(null != mouse)  {
                mouseX = mouse.getX();  
                mouseY = mouse.getY();

                clicked = 0;
            }
        }

        if (Greenfoot.mouseClicked(this) && clicked == 0){
            clicked = 1;
            getWorld().addObject( new marker(),0,0);
        }  

        move();

    }

    public void move(){

        if (getX()<mouseX) {setLocation(getX()+1,getY()); } 
        else if (getX()>mouseX) { setLocation(getX()-1,getY());}
        if (getY()<mouseY) {setLocation(getX(),getY()+1);} 
        else if (getY()>mouseY) { setLocation(getX(),getY()-1);} 

        if (getY()==mouseY) {
            setRotation(0);}

    }

    public void accident(){
        if(isTouching(boot.class)){
            World myWorld = getWorld();
            gameover gameOver = new gameover();
            myWorld.addObject(gameOver, myWorld.getWidth()/2, myWorld.getHeight()/2);
            /*GreenfootImage over = new GreenfootImage(150, 150);
            over.setColor(new Color( 0 , 0 , 0 , 0 ));*/
        }

    }

    public void crash(){
        if(isTouching(pier.class)){
            World myWorld = getWorld();
            gameover gameOver = new gameover();
            myWorld.addObject(gameOver, myWorld.getWidth()/2, myWorld.getHeight()/2);
            /*GreenfootImage over = new GreenfootImage(150, 150);
            over.setColor(new Color( 0 , 0 , 0 , 0 ));*/
        }
    }

    public void imageCaller(){
        if (boattype==2) {        //sets the boat imageaccording to boattype 
            if (boattype==2 && clicked == 1) {
                setImage("contr.png");
            }
            else{
                GreenfootImage[] imagearray= {
                        new GreenfootImage("cont0.png"),
                        new GreenfootImage("cont1.png"),
                        new GreenfootImage("cont2.png"),
                        new GreenfootImage("cont3.png"),
                        new GreenfootImage("cont4.png"),
                        new GreenfootImage("cont5.png"),
                        new GreenfootImage("cont6.png"),
                        new GreenfootImage("cont7.png"),
                        new GreenfootImage("cont8.png"),
                        new GreenfootImage("cont8.png")};  //switches back over to 1st image, so i emplied this.
                setImage(imagearray[state]);
                if (isTouching(boot.class)== (boattype==2)){
                    GreenfootImage[] image2= {
                            new GreenfootImage("cboom3.png")};
                    setImage(image2[state]);
                }

                if (isTouching(pier.class)== (boattype==2)){
                    setImage("cboom3.png");
                }

            }

        }
        else if (boattype==1) { 
            if (boattype==1 && clicked == 1) 
            {setImage("olier.png");}
            else{
                GreenfootImage[] imagearray= {
                        new GreenfootImage("olie0.png"),
                        new GreenfootImage("olie1.png"),
                        new GreenfootImage("olie2.png"),
                        new GreenfootImage("olie3.png"),
                        new GreenfootImage("olie4.png"),
                        new GreenfootImage("olie4.png")};  //switches back over to 1st image, so i emplied this.
                setImage(imagearray[state]);
                if (isTouching(boot.class)== (boattype==1)){
                    GreenfootImage[] image2= {
                            new GreenfootImage("oboom3.png")};
                    setImage(image2[state]);
                }

                if (isTouching(pier.class)== (boattype==1)){
                    setImage("oboom3.png");
                }

            }
        }
        else {
            boattype=3; //sets the 0 from the random to 3
            if (boattype==3 && clicked == 1) {setImage("zandr.png");}
            else {
                GreenfootImage[] imagearray= {
                        new GreenfootImage("zand0.png"),
                        new GreenfootImage("zand1.png"),
                        new GreenfootImage("zand2.png"),
                        new GreenfootImage("zand3.png"),
                        new GreenfootImage("zand4.png"),
                        new GreenfootImage("zand4.png")};
                setImage(imagearray[state]);
                if (isTouching(boot.class)== (boattype==3)){
                    GreenfootImage[] image2= {
                            new GreenfootImage("zboom3.png")};
                    setImage(image2[state]);
                }

                if (isTouching(pier.class)== (boattype==3)){
                    setImage("zboom3.png");
                }

            }

        }

    }

    public void locStop() {
        if (getX()>= getWorld().getWidth()-5) { getWorld().removeObject(this); } else {
            Actor loc1 = getOneObjectAtOffset(0, 25, loc1.class);
            if (loc1 != null) {
                locLocked=1;
                imageCaller();

                if (loadtimer > 1) {
                    setLocation(925,460);
                    loadtimer--;

                    if (boattype==2) {

                        if (loadtimer%10==0) {
                            state++;  

                        }
                        if (ending == 1) {  scoring();moneyTime();}
                    } else {if (ending == 1) {  descoring();lostMoney();}}

                } else { setLocation(getX()+1,460); }

            };
            Actor loc2 = getOneObjectAtOffset(0, 25, loc2.class);
            if (loc2 != null) {
                locLocked=1;
                imageCaller();

                if (loadtimer > 1) {
                    setLocation(925,280);
                    loadtimer--;

                    if (boattype==3) {

                        if (loadtimer%20==0) {
                            state++;  

                        }
                        if (ending == 1) {  scoring();moneyTime();}
                    } else {if (ending == 1) {  descoring();lostMoney();}}

                } else { setLocation(getX()+1,280); }

            }
            Actor loc3 = getOneObjectAtOffset(0, 25, loc3.class);
            if (loc3 != null) {
                locLocked=1;
                imageCaller();

                if (loadtimer > 1) {
                    setLocation(925,110);
                    loadtimer--;

                    if (boattype==1) {

                        if (loadtimer%20==0) {
                            state++;  

                        }
                        if (ending == 1) {  scoring();moneyTime();}

                    } else {if (ending == 1) {  descoring();lostMoney();}}

                } else { setLocation(getX()+1,110); }

            }
        }
    }

    public void circlemaker() {
        getWorld().addObject( new circle(), getX(), getY());
    }

    public void scoring() {
        World myWorld = getWorld();
        controllingcenter mundo = (controllingcenter)myWorld;
        Counter counter = mundo.getCounter();
        ending=0;
        if (boattype==3) {counter.addScore3();}
        if (boattype==2) {counter.addScore2();}
        if (boattype==1) {counter.addScore1();}/*World myWorld = getWorld();
        controllingcenter mundo = (controllingcenter)myWorld;
        Counter counter = mundo.getCounter();
        counter.addScore();
        ending=0;*/
    }

    public void descoring() {
        World myWorld = getWorld();
        controllingcenter mundo = (controllingcenter)myWorld;
        Counter counter = mundo.getCounter();
        ending=0;
        if (boattype==3) {counter.deScore3();}
        if (boattype==2) {counter.deScore2();}
        if (boattype==1) {counter.deScore1();}/*World myWorld = getWorld();
        controllingcenter mundo = (controllingcenter)myWorld;
        Counter counter = mundo.getCounter();
        counter.deScore();
        ending=0;*/
    }

    public void moneyTime()    {
        World myWorld = getWorld();
        controllingcenter world = (controllingcenter)myWorld;
        Money money = world.getMoney(); 
        //money.addMoney();
        ending=0;

        if (boattype == 3){money.addMoney3();}
        if (boattype == 2){money.addMoney2();}
        if (boattype == 1){money.addMoney1();}
    } 

    public void lostMoney(){
        World myWorld = getWorld();
        controllingcenter mundo = (controllingcenter)myWorld;
        Money money = mundo.getMoney();
        //money.lostMoney();

        ending=0;

        if (boattype == 3){money.lostMoney3();}
        if (boattype == 2){money.lostMoney2();}
        if (boattype == 1){money.lostMoney1();}
    }
}
