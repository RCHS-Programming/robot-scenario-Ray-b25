import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
    }    
    /**
     * Makes the robot move in the corresponding direction when the arrow keys are pressed.  
     */
    public void robotMovement()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation( getX(), getY() -3 );
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation( getX(), getY() +3 );
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation( getX() -3, getY());
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation( getX() +3, getY());
        }
    }
    /**
     * Makes the robot instantly go back to start if it touches the wall.   
     */
    public void detectWallCollision()
    {
        if (isTouching(Wall.class))
        {
            setLocation(50, 50);
        }
    }
    /**
     * Makes the robot instantly go back to start if it touches the spinning block.   
     */
    public void detectBlockCollision()
    {
        if (isTouching(Block.class))
        {
            setLocation(50, 50);
        }
    }
}
