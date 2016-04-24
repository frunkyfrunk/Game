import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class balance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class balancer extends boat
{
    public int voor ;
    
    /**
     * Act - do whatever the balance wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        voor();
    }

    public void voor(){
        List<box> boxl = getObjectsInRange(150, box.class);
              
        for(box b : boxl){
            if(b.getX()>320){
                voor =  boxl.size(); 
                //System.out.println("voor"+voor);
            }
        }
    }
}