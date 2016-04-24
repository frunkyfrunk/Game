import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class controllingcenter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class controllingcenter extends World
{
    Counter counter = new Counter();
    Money duku = new Money();
    pause pause = new pause();
    private Counter scoreDisplay;
    public int score = 0;
    
    
    public controllingcenter()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);

        setPaintOrder(Broke.class, Money.class, Counter.class, boot.class ,arrow.class, circle.class, haven.class, pier.class, unload.class); 
        populateWorld();   
        if (!UserInfo.isStorageAvailable())
        {
            getBackground().drawImage(new GreenfootImage("Sign in to be able to record a highscore", 30, new java.awt.Color(255, 255, 255), new java.awt.Color(0, true)), 150, 560 );
        }
        // scoreDisplay = new Counter();
        //addObject(scoreDisplay, 50, getHeight() - 50);
        addObject(new HighScore(scoreDisplay), getWidth() - 400, getHeight() - 560); 
        Greenfoot.setWorld(new menu());
    }   
    public void act()  
    {  
        if(!pause.readPause && !Greenfoot.isKeyDown("p"))  
            pause.readPause = true;  
        if(Greenfoot.isKeyDown("p") && pause.readPause)  
        {  
            if(pause.isPaused) pause.isPaused = false;  
            else         pause.isPaused = true;  
            pause.readPause = false;  
            addObject(new pause(), getWidth()/2, getHeight()/2);
        }  
        if(!pause.isPaused)  
        {  
            //Original contents of your act() method (if any).  
            
            
            
            
            
            

        } 
    }  
    
   
    public Counter getCounter()
    {
        return counter;
    }

    public Money getMoney()
    {
        return duku;
    }
    
    public void populateWorld()
    {

        addObject(new loc1(), 925,490);

        addObject(new loc2(), 925,310);

        addObject(new loc3(), 925,140);
        
        addObject(new generator(), 0,0);
        
        addObject(counter, 100, 40);
        
         addObject(new pier1(), 925,529);
        
        addObject(new pier2(), 925,349);
        
        addObject(new pier3(), 925,179);
        
        addObject(duku, 300, 40);
        
        addObject(new unld1(), 925,480);
        
        addObject(new unld2(), 925,300);
        
        addObject(new unld3(), 925,130);        

    }
}