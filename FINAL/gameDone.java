import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameDone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameDone extends general
{
    /**
     * Act - do whatever the gameDone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(!pause.isPaused)  
    { 
        setImage("fired.png"); 
        Greenfoot.stop();
        reset();
    }
    }    
    
    public void reset()
    {
        Counter.reset();
    }
     
}
