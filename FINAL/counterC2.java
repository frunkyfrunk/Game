import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class counterC2 extends Actor
{
    public int heal = 1000;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Heal: " + heal, 24, Color.WHITE, (new Color(0, 0, 0, 0))));
    }    
    
   
    
    public void loseheal()
    {
       heal--;
    } 
    public void addheal()
    {
       heal=+1000;
    } 
}