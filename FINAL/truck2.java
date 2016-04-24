import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class truck2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class truck2 extends mac
{
    private int moveaway=0;
    private int timer=70;
    /**
     * Act - do whatever the truck2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(!pause.isPaused)  
    { 
        if (beginning==1) {
            truckTypes();
            beginning=0;
        }

        if (moveaway==0) {
            setLocation(getX()-1, getY());
            timer--;
            if(getX() >= 762)
            {
                setLocation(765, getY());
            }
            
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

        if (timer==-174) {

            //getWorld().addObject(new truckgen(), 680, 41);
            getWorld().removeObject(this);

        }
    }    
}
}
