import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rushhoursign here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rushhoursign extends events
{
    /**
     * Act - do whatever the rushhoursign wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int timer=200;
    public void act() 
    {
        // Add your action code here.
        timer--;
        setLocation(getX()-5, getY());
        
        if (timer<=0) {
            getWorld().removeObject(this);
        }
    }    
}
