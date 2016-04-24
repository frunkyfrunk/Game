import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This actor creates the arrow signaling where the next boat is going to appear,
 * it uses a timer and after the timer reaches zero it will automatically create the predestined boat.
 * @author (Arnold Zijler) 
 * @version (version 1, 12/2/2014)
 */
public class arrow extends generator
{
    private int timer = 300; //initializes the timer
    
    
    public void act() 
    {
        //calls the public void image() constructor
        //to set image to arrow.png
        image();
        
        //Check if arrow there is another arrow touching the same position,
        //if true it will remove itself if it's timer is 300 (the first one always wins) and substracts from the countarrow
        if (isTouching(arrow.class) && timer == 300)
        {   generator.countarrow--;
            getWorld().removeObject(this);
        }
        
        //Checks if timer is bigger than zero, if so, it substracts one else it deletes this and creates a boat
        if ( timer >= 0 ) {
                timer -=1;
           } else {
               getWorld().addObject( new boot(),getX()-40,getY() );
               //-//getWorld().addObject( new circle(), getX(), getY());
               generator.countarrow--;
               getWorld().removeObject(this);
           }
    } 
    
    public void image()
    {
        //sets the image of arrow to arrow.png
    setImage("arrow.png");
    }
}
