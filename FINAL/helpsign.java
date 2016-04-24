import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class helpsign here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class helpsign extends events
{
    /**
     * Act - do whatever the helpsign wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int scaler=-5;
    
    public void act() 
    {
        
        
        scaler++;

        GreenfootImage image = getImage();
        image.scale(image.getWidth()+scaler, image.getHeight()+scaler);
        setImage(image);
        
        if (scaler>10) {
        getWorld().removeObject(this);
        }
    }    
}
