import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author Ray Brandeberry
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    private GreenfootImage robotimage1= new GreenfootImage("man01.png");
    private GreenfootImage robotimage2= new GreenfootImage("man02.png");
    private int lives = 3;
    private int score = 0;
    private int pizzaEaten = 0;
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
    }    
    /**
     * Makes the robot move in the corresponding direction when the arrow keys are pressed.  
     */
    public void robotMovement()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation( getX(), getY() -3 );
            animate();
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation( getX(), getY() +3 );
            animate();
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation( getX() -3, getY());
            animate();
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation( getX() +3, getY());
            animate();
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
            Greenfoot.playSound("hurt.wav");
            removeLife();
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
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
    }
    /**
     * Returns the robot to start and plays a sound when the robot touches the house.
     */
    public void detectHome()
    {
        if (isTouching(Home.class))
        {
            if (pizzaEaten == 5)
            {
                setLocation(50, 50);
                Greenfoot.playSound("yipee.wav");
                pizzaEaten = 0;
            }
        }
    }
    /**
     * If the robot touches a pizza, the pizza is removed and the eat.wav sound is played.
     */
    public void eatPizza()
    {
        if (isTouching(Pizza.class))
        {
            Greenfoot.playSound("eat.wav");
            removeTouching(Pizza.class);
            pizzaEaten = pizzaEaten + 1;
        }
    }
    /**
     * Constantly switches between the two animations of the robot.
     */
    public void animate()
    {
        if (getImage()== robotimage1)
        {
            setImage(robotimage2);
        }
        else
        {
            setImage(robotimage1);
        }
    }
    /**
     * Subtracts one from the number of lives.
     */
    public void removeLife()
    {
        lives = lives - 1;
    }
    /**
     * 
     */
    public void testEndGame()
    {
       
    }
}
