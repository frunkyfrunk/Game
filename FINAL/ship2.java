import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ship2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ship2 extends ships
{
    /**
     * Act - do whatever the ship2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        setLocation(getX()+1,getY());
        
        if (getX() >= getWorld().getWidth()-1) {
            getWorld().removeObject(this);
       
        }
        
        if (Greenfoot.getRandomNumber(800)==1) {
            getWorld().addObject( new human(), getX(), getY()+100);
        }
    }    
}
