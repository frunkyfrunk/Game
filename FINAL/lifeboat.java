import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lifeboat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lifeboat extends tool_ships
{
    /**
     * Act - do whatever the lifeboat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed=6;
    
    public void act() 
    {
              
       
    Actor human = getOneIntersectingObject(human.class);
    Actor dirt = getOneIntersectingObject(dirt.class);
        
    if (dirt == null) {
        speed=6;
    } else {
        speed=2;
    }
    
    if (human == null) {
        setLocation(getX()+speed,getY());
    }

    if (getX() >= getWorld().getWidth()-3) {
            getWorld().removeObject(this);
    }
}
}
   

