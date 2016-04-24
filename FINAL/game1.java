import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class game1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class game1 extends mainmenu
{
    public static int clicked = 0;
    /**
     * Act - do whatever the game1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
                
        GreenfootImage[] imagearray= {
                    new GreenfootImage("kiescontrol.png"),
                    new GreenfootImage("kiescontrolclicked.png"),};  
            setImage(imagearray[clicked]);  
        

        
            
            if (Greenfoot.mouseClicked(this)) {
              clicked++;
              game2.clicked = 0;
              game3.clicked = 0;
            } 
            
        if (clicked == 2) {
              Greenfoot.setWorld(new controllingcenter()); 
              clicked = 0;
        } 
         
        
        
       
    }    
}
