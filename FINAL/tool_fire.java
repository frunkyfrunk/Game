import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tool_fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tool_fire extends tools_options
{
    /**
     * Act - do whatever the tool_fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    if(Greenfoot.mouseClicked(this)) {
        tools.toolnumber = 2;
        mouse.mouseDragged=false;
    }
    }    
}
