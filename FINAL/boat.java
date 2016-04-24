import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class boat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boat extends minigame2
{
    /**
     * Act - do whatever the boat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int moveaway=0;
    private int timer=60;
    public int grond = 520;
    public static int rotation = 0;
    
    public void act() 
    {
        if(!pause.isPaused)  
    { 
        Actor box = getOneIntersectingObject( box.class); 
        rotate();
        rotatebox();
        
        if (box==null) 
        {
            moveaway=1;
        } 
        else 
        {
            moveaway=0;
        }

        if (moveaway==0) {
            setLocation(getX()+2, getY());
            if(getX() >=183)
            {
                setLocation(183, 489);
                
            }
        }

        if (moveaway==1) {
            setLocation(getX()-2, getY());
            timer--;
            winner();
        }

        if (timer==0) {
            
            getWorld().addObject(new boatgen(), 0, 0);
            getWorld().removeObject(this);

        }
        
    }
}
    public void winner(){
        World world = getWorld();
        winner wi = new winner();
        wi.act();
        world.addObject(wi, world.getWidth()/2, world.getHeight()/2);
    
        
    }

   
    
    public void rotatebox(){
        List<box> boxlist = getWorld().getObjects(box.class);

        if(getRotation() == 0){
            //System.out.println(getX());
            for(box b: boxlist){
                b.setRotation(0);

                //grond = getY();
            }
        }

        if(getRotation() == 3){
            for(box b: boxlist){

                b.setRotation(3);
                //if(b.getX()>20&&b.getX()<70){ grond = getY()-40;}
                //if(b.getX()>70&&b.getX()<125){ grond = getY()+5;}
                //if (getX()<250){grond = b.getY()+40;}
            }
        }
        if(getRotation() == 6){
            for(box b: boxlist){

                b.setRotation(6);

                for (int i=0;i<=60;i+=3){
                    //   if(getX()>0){ grond = b.getY()+i;}}
                }
            }
        }
        if(getRotation() == 357){
            for(box b: boxlist){
                b.setRotation(-3);
                

            }
        }
        if(getRotation() == 354){
            for(box b: boxlist){
                b.setRotation(-6);
                
                for (int i=0;i<500;i+=10){
                    //grond = getY();
                }
            }

        }
        if(getRotation() == 351){
            for(box b: boxlist){
                b.setRotation(-9);
                
                for (int i=0;i<500;i+=10){
                    //grond = getY();
                }
            }

        }
    }

    public void rotate(){
        balancer balancer =(balancer) getWorld().getObjects(balancer.class).get(0);
        balancel balancel =(balancel) getWorld().getObjects(balancel.class).get(0);
        box b =(box) getWorld().getObjects(box.class).get(0);
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
            //gameover();
        }
        if(hoeveelheid>0){
            setRotation(-3);
        }
        if(hoeveelheid>1){
            setRotation(-6);
        }
        if(hoeveelheid>2){
            setRotation(-9);
           // gameover();
        }
    }

   

}
