import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class human extends events
{
    /**
     * Act - do whatever the fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int animation = Greenfoot.getRandomNumber(29);
    private int health = 1000;
    private int scaler = 0;
            
    public void act() 
    {
        animation++;
        health--;
        
        if (animation <= 15) {
            setImage("drowningman1.png");
        } else {
            setImage("drowningman2.png");
        }
        
        if (animation >= 30) {
            getWorld().addObject( new helpsign(),getX()+15,getY()-60); 
            animation = 0;
            
        }

        Actor lifeboat = getOneIntersectingObject(lifeboat.class);
        
        if (lifeboat!=null) {
            getWorld().removeObject(this);
        }
        
       
        //when the man drowns and becomes a floating dead body
        if (health <= 0) {
            getWorld().addObject(new drownedman(),getX(), getY());
            getWorld().removeObject(this);

            //counterLife leef = ((room3)getWorld()).getCounterlife();
            //leef.loselife();

        }



         
        
        //if (getX()<10) {
        //setLocation(10,getY());
        //}
        
        //if (getX()>getWorld().getWidth()-10) {
        //setLocation(getWorld().getWidth()-10,getY());

        
        //}

    }    

}
