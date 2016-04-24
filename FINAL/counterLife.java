import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class counterLife extends Actor
{
    public int life = 3;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("life: " + life, 24, Color.WHITE, (new Color(0, 0, 0, 0))));
    }    
    
   
    
    public void loselife()
    {
       life=-1;
    } 
}