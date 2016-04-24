import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boat_generator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boat_generator extends gameobjects
{
    /**
     * Act - do whatever the boat_generator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int timer=0;
    public int timeradd=1400;
    public void act() 
    {
        // Add your action code here.
        
        timer++;

        if (gameobjects.difficultylevel==1) {
            timeradd=1200;
        }
        
        if (gameobjects.difficultylevel==2) {
            timeradd=1000;
        }
        
        if (gameobjects.difficultylevel==3) {
            timeradd=1000;
        }
        
        if (gameobjects.difficultylevel==4) {
            timeradd=700;
        }
        
        if (gameobjects.difficultylevel==5) {
            timeradd=0;
        }
        
        
        
        
        if (timer%(500+timeradd)==0 || timer==100) {
        getWorld().addObject( new ship1(), 0, 400);
        }
        
        if (timer%(1700+timeradd)==0) {
        getWorld().addObject( new ship2(), 0, 300);
        }
        
        if (timer%(2300+timeradd)==0) {
        getWorld().addObject( new ship3(), getWorld().getWidth(), 600);
        }
        
        if (timer%(753+timeradd)==0) {
        getWorld().addObject( new ship4(), getWorld().getWidth(), 500);
        }
    }    
}
