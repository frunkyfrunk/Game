import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class room3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class room3 extends World
{
    counterC1 c1 = new counterC1();
    counterC2 c2 = new counterC2();
    counterEuro euro = new counterEuro();
    counterEuras euras = new counterEuras();
    counterLife life = new counterLife();
    /**
     * Constructor for objects of class room3.
     * 
     */
    public room3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        
        setPaintOrder( 
        
        
        tools_options.class, 
        mouse.class, 
        fixed.class,
        helpsign.class,
        ship3.class,
        ship4.class,
        lifeboat.class,
        human.class,
        ship1.class,
        ship2.class,
        
        baggerschip.class,
        
        
        
        waterspuit.class,
        fire.class, 
        building.class,
        
        dirt.class
        
        );
        
        prepare();
        
    }
    
     private void prepare()
    {
        //sets the game stuff//
        addObject(new gameobjects(),0,0);
        addObject(new building(),0,0);
        addObject(new mouse(),0,0);
        
        //sets the tool_box//
        addObject( new tool_wrench(), 75, 75);
        addObject( new tool_fire(), 75, 145);
        addObject( new tool_lifepreserver(), 75, 215);        
        addObject( new tool_skimmer(), 75, 285);   
        
        //sets the generators//
        addObject ( new boat_generator(), 0, 0);
        addObject ( new dirt_generator(), 0, 0);
        
        //sets the buildings//
        crane crane1 = new crane();
        addObject(crane1, 131, 196);
        
        crane1 crane2 = new crane1();
        addObject(crane2, 310, 193);
        
        crane1.setLocation(139, 188);
        crane2.setLocation(310, 188);
        
        euromast euromast = new euromast();
        addObject(euromast, 559, 180);
        euromast.setLocation(549, 172);
        
        erasmusbrug erasmusbrug = new erasmusbrug();
        addObject(erasmusbrug, 820, 277);
        erasmusbrug.setLocation(820, 263);                            
        
        // heal and life
        addObject(euro,549, 10 );
                addObject(c1,149, 10 );
                        addObject(c2,320, 10 );
                                addObject(euras,820, 10 );
                              //  addObject(life,50, 10 );
                                    
    }
    public counterC1 getCounterC1()
    {
        return c1;
    }
        public counterC2 getCounterC2()
    {
        return c2;
    }
        public counterEuro getCounterEuro()
    {
        return euro;
    }
        public counterEuras getCounterEuras()
    {
        return euras;
    }
    public counterLife getCounterlife()
    {
        return life;
    }
}


