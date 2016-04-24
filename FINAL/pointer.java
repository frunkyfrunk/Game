import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pointer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pointer extends warning
{
    private int timer = 300;
    private GreenfootImage afbeelding1;
    private GreenfootImage afbeelding2;
    private boolean soundHasPlayed = false;
    private GreenfootSound mySound;
    private int steps = 0;
   
    /**
     * Act - do whatever the pointer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        // Add your action code here.
        rotate();

    }    

    public pointer()
    {
        afbeelding1 = new GreenfootImage("warning.png");
        afbeelding2 = new GreenfootImage("warning2.png");
    }

    public void rotate(){
        //box b =(box) getWorld().getObjects(box.class).get(0);
        //Actor boat=getOneObjectAtOffset(0,30, boat.class);
        //boolean noBox = getWorld().getObjects(box.class).isEmpty();
        if(steps == 300){
            steps =0;
        } else {
            steps++;
        }

        balancer balancer =(balancer) getWorld().getObjects(balancer.class).get(0);
        balancel balancel =(balancel) getWorld().getObjects(balancel.class).get(0);
        //box b =(box) getWorld().getObjects(box.class).get(0);
        int hoeveelheid = balancel.achter - balancer.voor;
        if(hoeveelheid==0){
            setRotation(0);
        }
        if(hoeveelheid<0){
            setRotation(25);
            if(steps == 0) {
            soundHasPlayed = false;
        }
        }
        if(hoeveelheid<-1){
            setRotation(75);
            
        }
        if(hoeveelheid<-2){
            setRotation(125);
            timer--;
            //Greenfoot.playSound("alarm.wav");
            if (!soundHasPlayed)
            {
                Greenfoot.playSound("alarm.wav");
                soundHasPlayed = true;  //This will cause this if block never to run again, unless you have code somewhere that turns it to false again.
            }
            if(timer == 0)
            {
                gameover();
            }
        }
        if(hoeveelheid>0){
            setRotation(-25);
            if(steps == 0) {
            soundHasPlayed = false;
        }
        }
        if(hoeveelheid>1){
            setRotation(-75);                     
            
        }
        if(hoeveelheid>2){
            setRotation(-125);
            timer--;
            //Greenfoot.playSound("alarm.wav"); 
            if (!soundHasPlayed)
            {
                Greenfoot.playSound("alarm.wav");
                soundHasPlayed = true;  //This will cause this if block never to run again, unless you have code somewhere that turns it to false again.
            }
            if(timer == 0)
            {
                gameover();
            }
        }

        
    }
    
   /*if (b.getRotation()>=115)
        {
            Greenfoot.playSound("alarm.wav");
            if (!soundHasPlayed)
            {
                
                mySound.play();
                soundHasPlayed = true;  //This will cause this if block never to run again, unless you have code somewhere that turns it to false again.
            }
        }

        else if (getRotation()<=-115)
        {
            Greenfoot.playSound("alarm.wav");
            if (!soundHasPlayed)
            {
                
                mySound.play();
                soundHasPlayed = true;  //This will cause this if block never to run again, unless you have code somewhere that turns it to false again.
            }
        }*/
    public void gameover(){
        World world = getWorld();
        gameDone go = new gameDone();
        go.act();
        world.addObject(go, world.getWidth()/2, world.getHeight()/2);
    }
}