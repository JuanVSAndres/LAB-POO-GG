import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{
    /** variables para animar el Robot*/
     private GreenfootImage Block;
    /**
     * Act - do whatever the Block wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    /**
     * Constructor Block / asignar la imagen de block.
     */
    public Block(){
        Block=new GreenfootImage("Block.png");
    }
    /**
     * Hacer rotar el Block.
     * 
     */
     public void setRotation()
    {
        //code
        turn(2); // spin
    }
    public void act() 
    {
        setRotation();
    } 
}
