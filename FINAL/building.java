import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class building here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class building extends gameobjects
{
    /**
     * Act - do whatever the building wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public static int firetimer=5000;
    
    public void act() 
    {
        if (gameobjects.difficultylevel==1) {
            firetimer=4000;
        }
        
        if (gameobjects.difficultylevel==2) {
            firetimer=3000;
        }
        
        if (gameobjects.difficultylevel==3) {
            firetimer=2000;
        }
        
        if (gameobjects.difficultylevel==4) {
            firetimer=1500;
        }
        
        if (gameobjects.difficultylevel==5) {
            firetimer=1000;
        }
        erasmusbrug eras =(erasmusbrug) getWorld().getObjects(erasmusbrug.class).get(0);
        euromast euro =(euromast) getWorld().getObjects(euromast.class).get(0);
        crane1 c1 =(crane1 ) getWorld().getObjects(crane1 .class).get(0);
        crane c  =(crane) getWorld().getObjects(crane.class).get(0);
        //erasmusbrug eras = new erasmusbrug();
        //euromast euro= new euromast();
        //crane1 c1 = new crane1();
       // crane c = new crane();
        if(euro.health <= 0 && eras.health <= 0 && c1.health <= 0 && c.health <= 0){
            gameover();
        }
        }    
        public void gameover(){
        World world = getWorld();
        gameDone go = new gameDone();
        go.act();
        world.addObject(go, world.getWidth()/2, world.getHeight()/2);
    }
    }
