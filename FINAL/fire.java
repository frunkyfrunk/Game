import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This object burn the buildings and spreads if given the time
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fire extends events
{
    /**
     * Act - do whatever the fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int animation = 0;
    private int health = 100;
    private int transparancy = 100;
    private int timer= 0;
            
    public void act() 
    {
        animation++;
        timer++;
        
        //checks if health is under 100, if so, it will increase in health (the fire feeds itself)
        //if (health <= 100) {
        //health++;
        //}
        
        //animation for the fire
        if (animation <= 5) {
            setImage("fire_1.png");
        } else {
            setImage("fire_2.png");
        }
        
        //resets the animation. also creates a smoke object
        if (animation >= 10) {
            animation = 0;
            getWorld().addObject( new smoke(), getX(), getY());
        }
        
        //if fire hits the waterspray (waterspuit) it will decrease in health
        //if health is below 0, it will be removed
        Actor waterspuit = getOneObjectAtOffset(0, 0, waterspuit.class);
        
        if (waterspuit != null ) {
            health-=3;
        }
        
        if (health <0) {
            getWorld().removeObject(this);
        }
        
        
        //when the timer hits 243, it will create 2 new fire object on both sides of getX()
        if (timer==3000) {
            getWorld().addObject( new fire(), getX()+70, getY());
            getWorld().addObject( new fire(), getX()-70, getY());
        }
        
        //this sets the transparancy of the object wich is linked to it's health
        transparancy= health+150;

        GreenfootImage image = getImage();
        getImage().setTransparency(transparancy);
        setImage(image);
        
    }    

}
