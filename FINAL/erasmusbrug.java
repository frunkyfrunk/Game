import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class erasmusbrug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class erasmusbrug extends building
{
    /**
     * Act - do whatever the erasmusbrug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int health = 1000;
    private int fixingtimer= -1;

    public void act() 
    {
           
        if (Greenfoot.getRandomNumber(building.firetimer)==1 && health > 0) {
            getWorld().addObject( new fire(), getX(), getY()+30);
        }
        
        if (Greenfoot.getRandomNumber(30)==1) {
            health-=1;
        }
        
        
        if (health<=200) {
            setImage("erasmusbrugbroken.png");
            
        }

        if (health<=0) {
            setImage("erasmusbrugdestroyed.png");
        }

        Actor mouse = getOneIntersectingObject(mouse.class);
        
        if (Greenfoot.mouseClicked(null) && health > 0 && tools.toolnumber==1 && mouse!=null) {
                health = 400;
                fixingtimer =25;
                getWorld().addObject( new fixed(), getX(), getY() );
                getWorld().addObject( new fixed(), getX()-100, getY()+70 );
                getWorld().addObject( new fixed(), getX()+100, getY()-40 );
                
                counterEuras leef = ((room3)getWorld()).getCounterEuras();
                leef.addheal();  
            }
           
        if (fixingtimer > 0) {
            fixingtimer--;
            
        } else if (fixingtimer == 0) {
            setImage("erasmusbrug.png");
            fixingtimer--;
        }
        
        Actor fire = getOneIntersectingObject(fire.class);
        
        if (fire!=null) {
            health--;
            counterEuras leef = ((room3)getWorld()).getCounterEuras();
            leef.loseheal(); 
        if(health <= 0){
             leef.heal = 0;   
        }
        }

    }    
}
