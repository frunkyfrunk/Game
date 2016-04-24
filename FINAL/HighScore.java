import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HighScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HighScore extends general
{
    private Actor alignLeftWith;
    /**
     * Act - do whatever the HighScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(!pause.isPaused)  
    { }
    }

    public HighScore(Actor alignLeftWith)
    {
        this.alignLeftWith = alignLeftWith;
        setImage(new GreenfootImage(1, 1));
        if (UserInfo.isStorageAvailable())
        {
            UserInfo me = UserInfo.getMyInfo();
            if (me != null)
            {
                setImage(new GreenfootImage("Your Best: " + me.getScore(), 25, java.awt.Color.black, new java.awt.Color(0, true)));
            }
        }
    }

}
