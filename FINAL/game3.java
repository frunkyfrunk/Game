import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class game3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class game3 extends mainmenu
{
    public static int clicked = 0;
    /**
     * Act - do whatever the game3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() 
    {
        GreenfootImage[] imagearray= {
                    new GreenfootImage("kiesramp.png"),
                    new GreenfootImage("kiesrampclicked.png"),};  
            setImage(imagearray[clicked]);  
        
            
            if (Greenfoot.mouseClicked(this)) {
              clicked++;
              game1.clicked = 0;
              game2.clicked = 0;
              
            } 
            
        if (clicked == 2) {
              Greenfoot.setWorld(new room3());
              clicked=0;
        } 
    }    
}
