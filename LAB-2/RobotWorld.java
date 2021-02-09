import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author (Juan Valderrama, Miguel Chachati, Valentina Romero) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepare();
    }
    /**
     * Preparar el mundo / luego es llamado por RobotWorld.
     * 
     */
    private void prepare(){
        addObject(new Robot(),48,50);
        /**
     * Crear las 6 paredes.
     * 
     */
        int[][] arrayWall = { {159,147},{52,147},{266,147},{587,147},{692,147},{791,147}};
        for(int i=0; i< arrayWall.length;i++){
            addObject(new Wall(),arrayWall[i][0],arrayWall[i][1]);
        }
        /**
     * Se añade el block, el score panel y el home.
     * 
     */
        addObject(new Block(),427,145);
        addObject(new Home(),751,552);
        addObject(new ScorePanel(),71,554);
        /**
     * Se crean las 5 manzanas.
     * 
     */
        int[][] arrayApple = {{720,46},{433,38},{183,302},{682,312},{417,537}};
        for(int j=0; j< arrayApple.length;j++){
            addObject(new Apple(),arrayApple[j][0],arrayApple[j][1]);
        }
    }
}
