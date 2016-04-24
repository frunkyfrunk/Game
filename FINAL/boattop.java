import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boattop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boattop extends minigame2
{
    private int clicked = 0;
    /**
     * Act - do whatever the boattop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(!pause.isPaused)  
    { 
        carry();
        rotate();
    } 
}

    public void carry()
    {
        //Actor boat = getOneObjectAtOffset(25, 35, boat.class);
        Actor boat = getOneIntersectingObject(boat.class);
        if (boat !=null && isTouching(boat.class))
        {
            setLocation(boat.getX(), boat.getY()-172); 

        }

        if (boat !=null  && boat.getX()<= getWorld().getWidth()-833)
        {
            getWorld().removeObject(this); 
        }

        
    }
    public void rotate()
    {
        balancer balancer =(balancer) getWorld().getObjects(balancer.class).get(0);
        balancel balancel =(balancel) getWorld().getObjects(balancel.class).get(0);
        int hoeveelheid = balancel.achter - balancer.voor;
        if(hoeveelheid==0){
            setRotation(0);
        }
        if(hoeveelheid<0){
            setRotation(3);
        }
        if(hoeveelheid<-1){
            setRotation(6);
        }
        if(hoeveelheid<-2){
            setRotation(9);
        }
        if(hoeveelheid>0){
            setRotation(-3);
        }
        if(hoeveelheid>1){
            setRotation(-6);
        }
        if(hoeveelheid>2){
            setRotation(-9);
        }
        
        
    }
}
