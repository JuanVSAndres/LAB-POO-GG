import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /** variables para animar el Robot*/
    private GreenfootImage Robo1;
    private GreenfootImage Robo2;
    private int Lives;
    private int Score;
    private int AppleEat;
    /**
     * Constructor robot / dos imagenes para simular movimiento.
     */
    public Robot(){
        Robo1=new GreenfootImage("man01.png");
        Robo2=new GreenfootImage("man02.png");
        Lives=3;
        Score=0;
        AppleEat=0;
        
    }
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Add your action code here.
    }    
}
