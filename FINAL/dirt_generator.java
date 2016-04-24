import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dirt_generator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dirt_generator extends gameobjects
{
    /**
     * Act - do whatever the dirt_generator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int timer = 0;
    
    public void act() 
    {
        timer++;
        
        if (timer%835==0) {
        getWorld().addObject( new dirt(), Greenfoot.getRandomNumber(getWorld().getWidth()), 400 + Greenfoot.getRandomNumber( 200) );
        }
    }    
}
