import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Broke here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Broke extends minigame2
{
    public int money = 0;
    /**
     * Act - do whatever the Broke wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(!pause.isPaused)  
    { 
        setImage("fired2.png");
        reset();
        Greenfoot.stop();
    }
    } 
    
    private void reset()
    {
        Counter.score = 0;
    }
}
