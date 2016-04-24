import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;  
import java.awt.Font; 

/**
 * Write a description of class title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class title extends pause
{
    /**
     * Act - do whatever the title wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     
    if(isPaused)  
    {
       GreenfootImage title = new GreenfootImage(75, 30);
       title.setColor(Color.BLACK);
       title.setFont(new Font("Arial", Font.PLAIN, 25)); 
       title.drawString ("Pauze", 2, 20);
       setImage (title);
    } else if(!isPaused) {
        getWorld().removeObject(this);}
   }
   }    

