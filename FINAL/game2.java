import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class game2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class game2 extends mainmenu
{
     public static int clicked = 0;
    /**
     * Act - do whatever the game2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage[] imagearray= {
                    new GreenfootImage("kiescontainer.png"),
                    new GreenfootImage("kiescontainerclicked.png"),};  
            setImage(imagearray[clicked]);  
        
            
            if (Greenfoot.mouseClicked(this)) {
              clicked++;
              game1.clicked = 0;
              game3.clicked = 0;
            } 
            
        if (clicked == 2) {
              Greenfoot.setWorld(new room()); 
              clicked=0;
        } 
    }    
}
