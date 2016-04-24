import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class unld1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class unld1 extends unload
{
    public boolean touching = true;
    public boolean touched = false;
    private int countdown = 150;
    private int starttime = 0;
    /**
     * Act - do whatever the unld1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(boot.class)){//&&countdown > 5){
            touching=true;
            countdown--;
            setImage("stok2.png");
            if(countdown < 15){
                setImage("stok1.png");
                
            }
            
        }
        
        else { 
            touched=false;
            setImage("stok1.png");
        }
        if (! isTouching(boot.class)){
                reset();
            }
    }    

    public void reset()
    {
        countdown = 150;
    }
}
