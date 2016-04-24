import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class turn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class turn extends minigame2
{
    public int boxtype= Greenfoot.getRandomNumber(3);
    private int boxsize = 20;
     public int state = 0;
     private int clicked = 0;
    /**
     * Act - do whatever the turn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(!pause.isPaused)  
    { }
    }    

    public void boxTypes()
    {
        if (boxtype==1)  //sets the boat imageaccording to boxtype, thus sets the 0 from the random to 1
        {
            GreenfootImage[] imagearray= {
                    new GreenfootImage("c1.png"),
                    new GreenfootImage("c12.png"),
                    new GreenfootImage("c123.png"),
                    new GreenfootImage("c123.png")};  //switches back over to 1st image, so i emplied this.
            setImage(imagearray[state]);

        }
        else if (boxtype==2) //sets the boat imageaccording to boxtype, thus sets the 0 from the random to 1
        {
            GreenfootImage[] imagearray= {
                    new GreenfootImage("c2.png"),
                    new GreenfootImage("c21.png"),
                    new GreenfootImage("c213.png"),
                    new GreenfootImage("c213.png")};  //switches back over to 1st image, so i emplied this.
            setImage(imagearray[state]);

        }
        else {
            boxtype=3; //sets the boat imageaccording to boxtype, thus sets the 0 from the random to 1
            if (boxtype==3){

                GreenfootImage[] imagearray= {
                        new GreenfootImage("c3.png"),
                        new GreenfootImage("c31.png"),
                        new GreenfootImage("c313.png"),
                        new GreenfootImage("c313.png")};  //switches back over to 1st image, so i emplied this.
                setImage(imagearray[state]);
            }

        }
    }

    public void turnThem()
    {
        Actor truck = getOneObjectAtOffset(0, 150, truck1.class);
        if(truck!=null &&clicked==1)
        {
            state++;
        }
    }
}
