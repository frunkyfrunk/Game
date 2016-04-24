import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class baggerschip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class baggerschip extends tool_ships
{
    /**
     * Act - do whatever the baggerschip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int animation = 0;
    
    public void act() 
    {
       
       
        Actor dirt = getOneIntersectingObject(dirt.class);
        
        if (dirt == null) {
        setLocation(getX()-2,getY());
        setImage("baggerschip1.png");
        
        } else {
        setLocation(getX()-1,getY());
        
        animation++;
        
        if (animation <= 5) {
            setImage("baggerschip2.png");
        } else {
            setImage("baggerschip3.png");
        }
        
        if (animation >= 10) {
            animation = 0;
        }
        
        }
        
        if (getX() <= 1) {
            getWorld().removeObject(this);

        }
    }    
}
