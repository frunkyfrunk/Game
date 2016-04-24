import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Dirty water makes the lifeboat move slower
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class dirt extends events
{
    /**
     * Act - do whatever the dirt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //it's supposed to slowly be visible, transparancy is also the 'health' of dirt
    private int transparancy = 1;
    private int timer=0;
    
    public void act() 
    {
        timer++;
     
        //checks if there is baggerschip, if it is, than transparancy will decrease,
        //or else it will increase (max 200). if transparancy < 1, than it will be removed
        Actor baggerschip = getOneIntersectingObject(baggerschip.class);
        if (baggerschip == null) {
            
        if (transparancy < 200) {
            if (timer%10==0) {
                transparancy++;
            }
        } else {transparancy=200;}
       } else {
            if (timer%5==0) {
                transparancy--;
            }  
        }
        
        GreenfootImage image = getImage();
        getImage().setTransparency(transparancy);
        setImage(image);
        
        if (transparancy < 1) {
            getWorld().removeObject(this);
        }
        
      
           
   
    }    
}
