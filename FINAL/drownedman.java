import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class drownedman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class drownedman extends events
{
    /**
     * Act - do whatever the drownedman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int transparancy = 200;
        
    public void act() 
    {
        transparancy--;

        GreenfootImage image = getImage();
        getImage().setTransparency(transparancy);
        setImage(image);

        if (transparancy <= 20) {
            getWorld().removeObject(this);
        }
    }    
}
