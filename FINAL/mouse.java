import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mouse extends tools
{
    MouseInfo mouse = Greenfoot.getMouseInfo();
    public static boolean mouseDragged = false;
    private int test = 6;
    private int waitingtimer= 0;
    private int waitingtimer2= 0;    
    
    /**
     * Act - do whatever the mouse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
   
       test += 0.6;
       if (waitingtimer > 0 ) {
       waitingtimer--; } else { waitingtimer=0;}

       if (waitingtimer2 > 0 ) {
       waitingtimer2--; } else { waitingtimer2=0;}
       
       mouse = Greenfoot.getMouseInfo();
        
       if(null != mouse)  { 
            setLocation(mouse.getX(), mouse.getY());
                    
       }
        
       if(Greenfoot.mousePressed(this))  { //If the mouse drags this, the squirt is turned on 
           mouseDragged = true; 
       }
       
       if(Greenfoot.mouseClicked(this)) {
           mouseDragged = false;
        }
    
       if(mouseDragged == true) {
           

                                
                if (tools.toolnumber==2) {
                        getWorld().addObject(new waterspuit(), getX(), getY());
                        setRotation(mouse.getX() / test);
                    }

       } else {
           setRotation(0);
       }

   

       
    
       if (tools.toolnumber==1) {
           if (mouseDragged == false) {
          setImage("wrench1.png");
              } 
        }
        
       if (tools.toolnumber==2) {
          setImage("slang.png");
       }
       
       if (tools.toolnumber==3) {
           Actor human = getOneIntersectingObject(human.class);
           
           if (waitingtimer2 == 0) {
               
           if (human==null) {
               setImage("lifepreserver.png");
            } else {
              setImage("lifepreserver2.png");
              
              if(Greenfoot.mouseClicked(this)) {
                getWorld().addObject(new lifeboat(), 0, getY());
                waitingtimer2=150;
                }
            }
       } else {
            setImage("lifepreserver3.png");
        }
       }

       if (tools.toolnumber==4) {
           Actor dirt = getOneIntersectingObject(dirt.class);
           
           if (waitingtimer == 0) {
               
           if (dirt==null) {
               setImage("recyclesign.png");
            } else {
              setImage("recyclesign2.png");
              
              if(Greenfoot.mouseClicked(this)) {
                getWorld().addObject(new baggerschip(), getWorld().getWidth(), getY());
                waitingtimer=500;
                }
            }
       } else {
            setImage("recyclesign3.png");
        }
    }
       
    }
    
    
    }    

