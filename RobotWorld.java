import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author Ray Brandeberry 
 * @version March 29, 2021
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
        addObject(new Robot(), 30, 30); 
        addObject(new Wall(), 50, 120);
        addObject(new Wall(), 150, 120);
        addObject(new Wall(), 250, 120);
        addObject(new Block(), 412, 120);
        addObject(new Wall(), 575, 120);
        addObject(new Wall(), 650, 120);
        addObject(new Wall(), 750, 120);
        addObject(new Home(), 750, 550);
        addObject(new Scorepanel(), 75, 555);
        addObject(new Pizza(), 700, 40);
        addObject(new Pizza(), 700, 220);
        addObject(new Pizza(), 400, 550);
        addObject(new Pizza(), 360, 120);
        addObject(new Pizza(), 460, 120);
    }
}
