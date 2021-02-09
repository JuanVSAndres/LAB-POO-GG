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
    /**
     * En este metodo vamos a mover al robot.
     */
    public void robotMovement()
    {
        //code 
        if(Greenfoot.isKeyDown("right"))
        {
           setLocation(getX()+3,getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
           setLocation(getX()-3,getY());
        }
        if(Greenfoot.isKeyDown("down"))
        {
           setLocation(getX(),getY()+3);
        }
        if(Greenfoot.isKeyDown("up"))
        {
           setLocation(getX(),getY()-3);
        }
    }
    public void detectWallCollision()
    {
        //code
        if(isTouching(Wall.class))
        {
            setLocation(48,50);
            Greenfoot.playSound("hurt.mp3");
        }
    }
    public void detectBlockCollision()
    {
        //code
        if(isTouching(Block.class))
        {
            setLocation(48,50);
            Greenfoot.playSound("hurt.mp3");
        }
    }
    public void detectHome()
    {
        //code
        if(isTouching(Home.class))
        {
            setLocation(48,50);
            Greenfoot.playSound("yipee.mp3");
        }
    }
    public void eatApple()
    {
        //code
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            Greenfoot.playSound("eat.mp3");
        }
    }
    public void act() 
    {
        // Add your action code here.
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatApple();
    }    
}
