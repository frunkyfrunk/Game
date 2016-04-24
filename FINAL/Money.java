import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class money here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Money extends general
{
     private int money = 0;
    /**
     * Act - do whatever the money wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Money: " + money, 24, Color.BLUE, (new Color(0, 0, 0, 0))));
        /*if (money<0) 
        {
            World myWorld = getWorld();
            Broke poor = new Broke();
            myWorld.addObject(poor, myWorld.getWidth()/2, myWorld.getHeight()/2);
        }*/
    }    

     public void addMoney4()
    {
        money=money+400;
    }
    
     public void lostMoney4()
    {
        money=money-250;
    } 
     public void addMoney2()//int boattype)
    {
        money=money+=400;
    }
    
     public void lostMoney2()
    {
        money=money-250;
    } 
      
     public void addMoney1()
    {
        money=money+350;
    } 
    
    public void lostMoney1()
    {
        money=money-175;
    } 
    
     public void addMoney3()
    {
        money=money+800;
    } 
    
    public void lostMoney3()
    {
        money=money-400;
    } 
     
    }    

