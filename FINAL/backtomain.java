import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color; 
import javax.swing.JOptionPane;
import java.util.*;
import java.awt.Font; 
/**
 * Write a description of class mainmenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class backtomain extends pause
{ private int prompt;
    /**
     * Act - do whatever the mainmenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    
    if(pause.isPaused)  
    {  
       GreenfootImage mainmenu = new GreenfootImage(110, 30);
       mainmenu.setColor(Color.BLACK);
       mainmenu.setFont(new Font("Arial", Font.PLAIN, 20)); 
       mainmenu.drawString ("Hoofdmenu", 2, 20);
       setImage (mainmenu);
        if(Greenfoot.mouseClicked(this))  
        {  
       prompt = JOptionPane.showConfirmDialog(
       null, "Weet je zeker dat je terug naar het hoofdmenu wilt gaan?");
       if(prompt < 1)
        {
            Greenfoot.setWorld(new menu());
        }
        else
        {
           
        }
    }
    } else if(!pause.isPaused) {
        getWorld().removeObject(this);}
    }    
}
