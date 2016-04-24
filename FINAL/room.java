import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class room here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class room extends World
{
    Counter counter = new Counter();
    Money duku = new Money();
    private Counter scoreDisplay;
    public int score = 0;
    
    /**
     * Constructor for objects of class room.
     * 
     */
    public room()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        setPaintOrder(winner.class, pause.class, balancer.class, balancel.class,water.class, gameDone.class, gameover.class, box.class, truck.class, hook.class); 
        addObject(new hook(), 0, 0);
        addObject(new boatgen(), 0, 0);
        addObject(new truckgen(), 767, 450);
        addObject(new HighScore(scoreDisplay), 500,40); 
        addObject(counter, 100, 40);
        addObject( duku, 300, 40);
        addObject(new pier(), 684, 548);
        addObject(new warning(), 370,145);
        addObject(new pointer(), 370,145);
        addObject(new balancel(), 91, 450);
        addObject(new balancer(), 275, 450);
        addObject(new water(), 450, 575);
        addObject(new pc(), 800,100);
        addObject(new speler(), 800,100);
        
        

        //addObject( new mac(), 617,211);
        /*addObject( new box(), Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(280));
        addObject( new box(), Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(280));
        addObject( new box(), Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(250));
        addObject( new box(), Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(280));*/
        if (!UserInfo.isStorageAvailable())
        {
            getBackground().drawImage(new GreenfootImage("Sign in to be able to record a highscore", 30, new java.awt.Color(255, 255, 255), new java.awt.Color(0, true)), 150, 560 );
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
}
