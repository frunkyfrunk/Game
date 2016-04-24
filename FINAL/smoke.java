import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class smoke here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class smoke extends mouse
{
    /**
     * Act - do whatever the smoke wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=255; 
        
    public void act() 
    {
    timer-=5;
    getImage().setTransparency(timer);
    
    setLocation(getX()+Greenfoot.getRandomNumber(7),getY()-Greenfoot.getRandomNumber(17));
    if (timer<=5) {
            getWorld().removeObject(this);
     }
    
    }    
}
