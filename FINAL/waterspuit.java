import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class waterspuit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class waterspuit extends mouse
{
    MouseInfo mouse = Greenfoot.getMouseInfo();
    public int clicked=0; 
    private int timer=255; 
    /**
     * Act - do whatever the waterspuit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
     //gets information from your mouse
    
    timer-=3.5;
    getImage().setTransparency(timer);
    
    setLocation(getX()+Greenfoot.getRandomNumber(7),getY()-Greenfoot.getRandomNumber(7));
    if (timer<=5) {
            getWorld().removeObject(this);
     }
    
    
    }    
    
    
}
