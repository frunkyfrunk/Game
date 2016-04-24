import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class line here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class line extends minigame2
{
    /**
     * Act - do whatever the line wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(!pause.isPaused)  
    { 
        getWorld().removeObject(this);
    }
    }    
}
