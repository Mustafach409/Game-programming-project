import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FallingObject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FallingObject extends Actor
{
    /**
     * Act - do whatever the FallingObject wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + 3);
        if (isAtEdge()){
            getWorld().removeObject(this);
        }// Add your action code here.
    }
}
