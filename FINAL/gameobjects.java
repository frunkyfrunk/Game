import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameobjects here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameobjects extends Actor
{
    /**
     * Act - do whatever the gameobjects wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //difficulty settings for the game
    public static int difficultytimer = 0;
    public static int difficultylevel = 1;

    //how many buildings are standing
    public static int standingbuildings =4;
    
    public void act() 
    {
        
        
        difficultytimer++;
        
        if (difficultytimer%1600==0) {
 
            if (difficultylevel == 4) {
                
                //difficulty 5 announcement, also known as rushhour
            getWorld().addObject( new rushhoursign(), getWorld().getWidth(), 100);
            }
            
            difficultylevel++;
        }
       
        if (difficultylevel > 5) {
            
            //resets the difficultylevel to 1 after rushhour
            difficultylevel=1;
        }
        

        
    }    
}
