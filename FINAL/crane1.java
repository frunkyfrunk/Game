import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class crane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class crane1 extends building
{
    /**
     * Act - do whatever the crane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int health = 1000;
    private int fixingtimer= -1;

    public void act() 
    {
        
        if (Greenfoot.getRandomNumber(30)==1) {
            health-=1;
        }

        if (Greenfoot.getRandomNumber(building.firetimer)==1 && health > 0) {
            getWorld().addObject( new fire(), getX(), getY()+100);
        }
        
        
        if (health<=150) {
            setImage("hijskraanbroken.png");
        }

        if (health<=0) {
            setImage("hijskraandestroyed.png");
        }

        Actor mouse = getOneIntersectingObject(mouse.class);
        
        if (Greenfoot.mouseClicked(null) && health > 0 && tools.toolnumber==1 && mouse!=null) {
                health = 300;
                fixingtimer =25;
                getWorld().addObject( new fixed(), getX(), getY() );
                getWorld().addObject( new fixed(), getX()-10, getY()-70 );
                getWorld().addObject( new fixed(), getX()+30, getY()+70 );
                
                counterC2 leef = ((room3)getWorld()).getCounterC2();
                leef.addheal();  
            }
           
        if (fixingtimer > 0) {
            fixingtimer--;
            
        } else if (fixingtimer == 0) {
            setImage("hijskraan1.png");
            fixingtimer--;
        }
        
        Actor fire = getOneIntersectingObject(fire.class);
                    
        if (fire!=null) {
            health--;
            counterC2 leef = ((room3)getWorld()).getCounterC2();
            leef.loseheal();
        if(health <= 0){
             leef.heal = 0;   
        }
        }

    }    
}
