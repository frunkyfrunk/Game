import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mac extends truck
{
    private int clicked = 0;
    private int countdown = 150;
    private int starttime = 0;
    public boolean Here = true;
    public boolean wasHere = false;
    private int moveaway=0;
    private int timer=70;
    public int trucktype= Greenfoot.getRandomNumber(3);
    public int beginning=1;
    /**
     * Act - do whatever the mac wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(!pause.isPaused)  
    { 
        // Add your action code here.
        Actor mac = getOneObjectAtOffset(0, 25, box.class);
        Actor box = getOneIntersectingObject( box.class);
        macgrabbing();

        if (beginning==1) {
            truckTypes();
            beginning=0;
        }

        if (moveaway==0) {
            setLocation(765, getY());
            timer--;
        }

        if (timer==0) {
            moveaway=1;
        }

        if (moveaway==1) {
            timer--;
        }

        if (timer==-100) {
            moveaway=2;
        }

        if (moveaway==2) {
            setLocation(getX()+3,getY()); 
            timer--;
        }

        if (timer==-174)//(getX()>=getWorld().getWidth()-5 )//&& (getWorld().getObjects(mac.class).size() == 0))//(timer==-174) 
        {
            getWorld().removeObject(this);

            //getWorld().addObject(new truckgen(), 767, 450);

        }
    }
    }    
    public void truckTypes()
    {
        if(getWorld().getObjects(mac.class).size() == 0)
        {
            if (trucktype==1)
            {
                getWorld().addObject( new truck1(), 800, 300);
                //setImage("t21.png");
            }

            else if (trucktype==2)
            {
                getWorld().addObject( new truck2(), 800, 300);
                //setImage("t22.png");
            }

            else{
                trucktype=3;
                getWorld().addObject( new truck3(), 800, 300);
                //setImage("t23.png");
            }
        }
        else {
            
        }

    }

    public void macgrabbing() {
        //this function checks if a box if begin grabbed or not
        //this method uses the variables private int clicked, gravity, ground

        MouseInfo mouse = Greenfoot.getMouseInfo();  //gets information from your mouse

        //this is called for when the box is being grabbed
        //checks if mouse is in the room and if clicked is equal to 1/true
        if(null != mouse && clicked==1)  {
            setLocation(mouse.getX(), mouse.getY());    

        }

        //checks if box is able to be clicked on, if true, it will set clicked to 1/true and gravity to 0
        if (Greenfoot.mousePressed(this)){  
            clicked=1;
            World myWorld = getWorld();
            gameover gameover = new gameover();
            myWorld.addObject(gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);

        }

        //checks if box is released, if true, it will set clicked to 0
        if (Greenfoot.mouseClicked(null)){  
            clicked=0;
        }

    }

}