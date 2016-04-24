import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class opt_mute here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class opt_mute extends mainmenu
{
    /**
     * Act - do whatever the opt_mute wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int mute=0;
    
    public void act() 
    {

      if (mute==0) {
            setImage("opt_mute.png");
            
            if (Greenfoot.mouseClicked(null)) {
            mute=1;
      }
      
      
      }
      
      if (mute==1) {
            setImage("opt_mute0.png");
            
            if (Greenfoot.mouseClicked(null)) {
            mute=0;
      }
      }
    }    
}
