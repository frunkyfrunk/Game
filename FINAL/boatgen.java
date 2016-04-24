import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boatgen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boatgen extends minigame2
{
    /**
     * Act - do whatever the boatgen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int callnew=0;
    private int timer= Greenfoot.getRandomNumber(300);
    public void act() 
    {
        if(!pause.isPaused)  
    { 
        if (callnew==0) {
            timer--;            
            if (timer<0) {
                getWorld().addObject( new boat(), 183, 491);
                getWorld().addObject( new boattop(), 183, 319);

                getWorld().addObject( new box(), 22, 393);
                getWorld().addObject( new box(), 62, 393);
                getWorld().addObject( new box(), 102, 393);
                getWorld().addObject( new box(), 142, 393);
                getWorld().addObject( new box(), 182, 393);
                getWorld().addObject( new box(), 222, 393);
                getWorld().addObject( new box(), 262, 393);
                getWorld().addObject( new box(), 302, 393);
                getWorld().addObject( new box(), 342, 393);

                getWorld().addObject( new box(), 22, 353);
                getWorld().addObject( new box(), 62, 353);
                getWorld().addObject( new box(), 102, 353);
                getWorld().addObject( new box(), 142, 353);
                getWorld().addObject( new box(), 182, 353);
                getWorld().addObject( new box(), 222, 353);
                getWorld().addObject( new box(), 262, 353);
                getWorld().addObject( new box(), 302, 353);
                getWorld().addObject( new box(), 342, 353);

                getWorld().addObject( new box(), 22, 313);
                getWorld().addObject( new box(), 62, 313);
                getWorld().addObject( new box(), 102, 313);
                getWorld().addObject( new box(), 142, 313);
                getWorld().addObject( new box(), 182, 313);
                getWorld().addObject( new box(), 222, 313);
                getWorld().addObject( new box(), 262, 313);
                getWorld().addObject( new box(), 302, 313);
                getWorld().addObject( new box(), 342, 313);

                callnew=1;

                getWorld().removeObject(this);
            }
        }
    }
} }
