import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ship3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ship3 extends ships
{
    /**
     * Act - do whatever the ship3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-1,getY());
        
        if (getX() <= 1) {
            getWorld().removeObject(this);
       
        }
        
        if (Greenfoot.getRandomNumber(800)==1) {
            getWorld().addObject( new human(), getX(), getY()-100);
        }
    }    
}
