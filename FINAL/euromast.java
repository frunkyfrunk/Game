import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class euromast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class euromast extends building
{
    /**
     * Act - do whatever the euromast wants to do. This method is called whenever
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
            getWorld().addObject( new fire(), getX()-10, getY()+120);
        }
        
        
        if (health<=200) {
            setImage("euromastbroken.png");
        }

        if (health<=0) {
            setImage("euromastdestroyed.png");
        }

        Actor mouse = getOneIntersectingObject(mouse.class);
                
        if (Greenfoot.mouseClicked(null) && health > 0 && tools.toolnumber==1 && mouse!=null) {
                health = 1000;
                fixingtimer =25;
                getWorld().addObject( new fixed(), getX(), getY() );
                getWorld().addObject( new fixed(), getX()-10, getY()-70 );
                getWorld().addObject( new fixed(), getX()+10, getY()+70 );
                
                counterEuro leef = ((room3)getWorld()).getCounterEuro();
                leef.addheal();  
            }
           
        if (fixingtimer > 0) {
            fixingtimer--;
            
        } else if (fixingtimer == 0) {
            setImage("euromast.png");
            fixingtimer--;
        }
        
        
        Actor fire = getOneIntersectingObject(fire.class);
        
        if (fire!=null) {
            health--;
            counterEuro leef = ((room3)getWorld()).getCounterEuro();
            leef.loseheal();
        if(health <= 0){
             leef.heal = 0;   
        }
        }
    }    
}
