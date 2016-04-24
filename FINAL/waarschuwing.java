import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Write a description of class waarschuwing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class waarschuwing extends box
{
    /**
     * Act - do whatever the waarschuwing wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(!pause.isPaused)  
    { 
        waarschuwingImage();
    }
}
    
    public void waarschuwingImage(){
        GreenfootImage war = new GreenfootImage(100,100);
        war.setColor(Color.RED);
        war.fillOval(0,0,100,100);
        setImage(war);
        
    }
}
