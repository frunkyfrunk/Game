import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class truckgen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class truckgen extends minigame2
{
    public int callnew=0;
    private int timer= 300;
    private int truckrandom= 1;

    public void act() 
    {

        if(!pause.isPaused)  
    { 
        if (callnew==0) 
        {    
            setImage("rl.png");

        } else {

            setImage("gl.png");
        }

        if (timer<=100) {
            callnew=1;
        }

        if (timer<=0) {

            truckrandom= Greenfoot.getRandomNumber(3);
            if (truckrandom==0){
                getWorld().addObject( new truck1(), 800, 460);
            } else if (truckrandom==1){
                getWorld().addObject( new truck2(), 800, 460); 
            } else {
                getWorld().addObject( new truck3(), 800, 460); 
            }
            timer=800;
            callnew=0;
        }

        timer--;
    } 
}
    public void reset()
    {
        timer = 0;
    }

}
