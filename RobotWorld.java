import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author Ray Brandeberry 
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
        addObject(new Robot(), 50, 50); 
        addObject(new Wall(), 50, 150);
        addObject(new Wall(), 150, 150);
        addObject(new Wall(), 250, 150);
        addObject(new Block(), 425, 150);
        addObject(new Wall(), 575, 150);
        addObject(new Wall(), 650, 150);
        addObject(new Wall(), 750, 150);
        addObject(new Home(), 600, 400);
        addObject(new Scorepanel(), 200, 400);
        addObject(new Pizza(), 700, 40);
        addObject(new Pizza(), 400, 300);
        addObject(new Pizza(), 405, 420);
        addObject(new Pizza(), 440, 470);
        addObject(new Pizza(), 440, 406);
    }
}
