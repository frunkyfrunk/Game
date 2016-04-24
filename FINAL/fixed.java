import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Animation for when you fix a building with a wrench
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fixed extends events
{
    /**
     * Act - do whatever the fixed wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int animation=0;
    private int timer=0;
    
    public void act() 
    {
        //Animation for when you fix a building with a wrench
        animation++;
        timer++;

        if (animation <= 10) {
            setImage("fixed1.png");
        } else {
            setImage("fixed2.png");
        }
        
        if (animation >= 20) {
            animation = 0;
        }
        
        
        if (timer >= 50) {
            getWorld().removeObject(this);
        }
    }    
}
