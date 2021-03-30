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
        addObject(new Robot(), 50, 50); 
        addObject(new Wall(), 50, 150);
        addObject(new Wall(), 150, 150);
        addObject(new Wall(), 250, 150);
        addObject(new Block(), 412, 150);
        addObject(new Wall(), 575, 150);
        addObject(new Wall(), 650, 150);
        addObject(new Wall(), 750, 150);
        addObject(new Home(), 750, 550);
        addObject(new Scorepanel(), 75, 555);
        addObject(new Pizza(), 700, 40);
        addObject(new Pizza(), 700, 250);
        addObject(new Pizza(), 400, 550);
        addObject(new Pizza(), 360, 150);
        addObject(new Pizza(), 460, 150);
    }
}
