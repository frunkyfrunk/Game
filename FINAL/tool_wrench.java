import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tool_wrench here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tool_wrench extends tools_options
{
    /**
     * Act - do whatever the tool_wrench wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
    if(Greenfoot.mouseClicked(this)) {
        tools.toolnumber = 1;
    }
    
    }    
}
