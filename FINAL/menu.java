import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{

    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1338, 465, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        game1 game1 = new game1();
        addObject(game1, 1092, 287);
        game2 game2 = new game2();
        addObject(game2, 213, 258);
        game2.setLocation(302, 255);
        place1 place1 = new place1();
        addObject(place1, 970, 79);
        options0 options0 = new options0();
        addObject(options0, 300, 90);
        game3 game3 = new game3();
        addObject(game3, 1182, 174);
    }
}
