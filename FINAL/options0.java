import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class options0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class options0 extends mainmenu
{
    /**
     * Act - do whatever the options0 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
            if (Greenfoot.mouseClicked(this)) {
                getWorld().addObject(new opt_mute(), 400, 90);
            }
    }    
}
