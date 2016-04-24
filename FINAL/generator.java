import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the actor that generates the arrows wich will and create the boats
 * The generator consists of a timer and timerrange, a static counterarrow and a static maxarrow so that there is always control over the difficulty
 * @author (Arnold Zijler) 
 * @version (version 1, 12/2/2014)
 */
public class generator extends minigame1
{
    //initializes all the public variables that are used
    //(timerrange, maxarrow are changed as difficulty will increase (see below))
    public int timerrange = 700 ;
    public int timer = timerrange; 
    public static int maxarrow = 2 ;
    public static int countarrow = 0;
    public static int countboat = 0;
    public int difficulty = 0;
    
    public void act() 
    {
        //when timer runs out it will check the amount of arrows and adds one randomly.
        //this if always sets the timer to a new randomrange timerrange
            
    if(!pause.isPaused)  
    { 
        if ( countarrow < 0 ) { countarrow = 0;}
        if ( timer > 0 ) { timer--; }
        
        if (timer == 0) 
            {
                if (countarrow < maxarrow) {
                        getWorld().addObject( new arrow(), 20 , Greenfoot.getRandomNumber(getWorld().getHeight()));
                        generator.countarrow++;
                    };

                timer = Greenfoot.getRandomNumber(timerrange);
            }
             
            
        //each step is a difficulty addition,
        //every 10000 steps it will add maxarrow and subtracts timerrange with 50   
        difficulty++;
        
        if (difficulty%5000 == 0) {
            
            if (maxarrow < 8) {
            maxarrow++;
            };
            
            if (timerrange > 100) {
            timerrange = timerrange-100;
            };
        }

    }    
}
}
