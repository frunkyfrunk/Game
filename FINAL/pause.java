import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;  
/**
 * Write a description of class pause here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pause extends general
{
    public static boolean readPause = true;      
    public static boolean isPaused = false; 
    /**
     * Act - do whatever the pause wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  
    public void act() 
    {
       
      
       
       if(!isPaused)  
    {  Actor title;
       title = getOneObjectAtOffset(0, 0, title.class);
       if (title != null)
       {
           getWorld().removeObject(this);
        }
        } else {
       getWorld().addObject(new title(), getWorld().getWidth()/2, 50);
       getWorld().addObject(new backtogame(), getWorld().getWidth()/2, 80);
       getWorld().addObject(new backtomain(), getWorld().getWidth()/2, 110);
       
        }
    }    
}
