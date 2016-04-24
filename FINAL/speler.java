import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class speler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class speler extends pc
{
    public int timmer = 75;
    /**
     * Act - do whatever the speler wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int start = 1;
        
        if(start == 1){
            if(timmer<0){
            timmer = 75;
            setRotation(getRotation()+1);
        }else{
            timmer--;
        }
        if(getRotation()==290){
            Greenfoot.playSound("alarm.wav");
        }
        if(getRotation()==359){
            gameover();
        }
        }
    }
        public void gameover(){
        World world = getWorld();
        gameDone go = new gameDone();
        go.act();
        world.addObject(go, world.getWidth()/2, world.getHeight()/2);
    }
}
