import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends general
{
    public static int score = 0;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         setImage(new GreenfootImage("Score: " + score, 24, Color.BLACK, (new Color( 0 , 0 , 0 , 0 ))));
         if (score<0) 
         {
             score=0;
             reset();
             reset2();
            }
         UserInfo me = UserInfo.getMyInfo();
        if (me != null)
        {
            if (score > me.getScore())
            {
                // It's a high-score, only update the score if ours is now higher:
                
                me.setScore(score);
                me.store();
                
            }

        }
    }    
    
    /*public Counter(){
        setImage(new GreenfootImage("Score: " + score, 24, Color.BLUE, (new Color(0, 0, 0, 0))));;
    }*/
    
    public void addScore3()
    {
        score=score+50;
    } 
    
    public void deScore3()
    {
        score=score-50;
    } 
    
     public void addScore4()
    {
        score=score+100;
    } 
    
    public void deScore4()
    {
        score=score-50;
    }
    
     public static void reset()
    {
        score = 0;
    }
    
    public static void reset2()
    {
        score = 0;
    }
    
    public static int getScore2()
    { 
         return score; 
    }
    public void addScore1()
    {
        score=score+250;
    } 
    
    public void deScore1()
    {
        score=score-125;
    } 
    
     public void addScore2()
    {
        score=score+400;
    } 
    
    public void deScore2()
    {
        score=score-200;
    } 
    
    public static void gameOver()
    {
        reset();
    }  
}
