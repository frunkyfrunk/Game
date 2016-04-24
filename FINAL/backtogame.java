import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;  
import java.awt.Font; 

/**
 * Write a description of class backtogame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class backtogame extends pause
{
    /**
     * Act - do whatever the backtogame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    if(pause.isPaused)  
    {  
       GreenfootImage backtogame = new GreenfootImage(148, 30);
       backtogame.setColor(Color.BLACK);
       backtogame.setFont(new Font("Arial", Font.PLAIN, 20)); 
       backtogame.drawString ("Spel Hervatten", 2, 20);
       setImage (backtogame);
        if(Greenfoot.mouseClicked(this))  
        {  
            pause.isPaused = false; 
        }
    } else if(!pause.isPaused) {
        getWorld().removeObject(this);}
    }    
}