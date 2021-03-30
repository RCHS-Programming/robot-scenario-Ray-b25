import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{
    /**
     * Turns the block 2 degrees every frame, making the blokc spin constantly.
     */
    public void act() 
    {
        turn(2);
    }  
}
