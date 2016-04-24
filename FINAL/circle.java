import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;  
/**
 * Write a description of class circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class circle extends everything
{
    private int timer=5;

    MouseInfo mouse = Greenfoot.getMouseInfo();
    /**
     * Act - do whatever the circle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        image(); //draws the circle image
        Actor a = getOneIntersectingObject(circle.class);  

        if(a != null)  
        {  
            GreenfootImage circlered = new GreenfootImage(300, 300);
            circlered.setColor(Color.RED);  
            circlered.drawOval(0, 0, 300,300);  
            setImage(circlered);
            Greenfoot.playSound("alarm.wav");
        }

        if(timer<0){
            timer = 5;
            getWorld().removeObject(this);
        }
        else
        {
            timer--;
        }
    }

    public void image(){
        GreenfootImage circle = new GreenfootImage(150, 150);
        circle.setColor(new Color( 0 , 0 , 0 , 0 ));
        circle.drawOval(0, 0, 150,150);  
        setImage(circle);        
    }
}   

