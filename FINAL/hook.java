import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hook extends minigame2
{
   public int clicked=0; //sets the clicked variable (used in the hookgrabbing to set the state of holding the mouse clicked or releasing it)

    public void act() 
    {
        if(!pause.isPaused)  
    { 
        hookgrabbing(); //calls the hookgrabbing constructor, it uses the "clicked" variable
    }
    }    
    
    public void hookgrabbing() {
        //this method will make the hook able to change states for grabbing
        //it uses "public int clicked" (in the public class hook extends Actor)
        
        MouseInfo mouse = Greenfoot.getMouseInfo(); //gets information from your mouse

        //checks if there is a mouse in the room, if so, it sets this object at mouse position
        //also adds an object new line() everystep for the rope holding the hook (does not properly work yet)
        if(null != mouse)  { 
            setLocation(mouse.getX(), mouse.getY());
            getWorld().addObject(new line(), mouse.getX(), mouse.getY()-150);

        }
        
        //these if's deal with the mouse grabbing things and releasing
        
        //if mouse click is pressed it will change clicked to true/1 and sets the image
        if (Greenfoot.mousePressed(null)){  
            clicked=1;
            setImage("hook2.png");
        }

        //if mouse click is released it will change clicked to false/0 and sets the image
        if (Greenfoot.mouseClicked(null)){  
            setImage("hook1.png");
            clicked=0;
        }

        //reassuring if statement so that the images will be sure of to match the states
        //if clicked is equal to 0/false it will set the image 
        if (clicked==0) {
            setImage("hook1.png");
        }

    }
}
