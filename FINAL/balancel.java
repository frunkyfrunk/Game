import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class balacer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class balancel extends boat
{
    public int achter ;

    //balancer balancer = new balancer();
    /**
     * Act - do whatever the balacer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 

    {
        achter();
    } 

    public void achter(){
        Actor boat = getOneObjectAtOffset(0, 0, boat.class);
        if (boat !=null)
        {
            List<box> boxl = getObjectsInRange(150,box.class);
            for(box b : boxl){
                if(b.getX()<180){
                    achter = boxl.size();

                }
            }
        }
    }
}
