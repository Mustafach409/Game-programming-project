import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        catchObject();
        hitBadObject();// Add your action code here.
    }
    private void move(){
        if (Greenfoot.isKeyDown("left")){
            setLocation(getX() - 5, getY());
        }
        if (Greenfoot.isKeyDown("right")){
            setLocation(getX() + 5, getY());
        }
    }
    private void catchObject(){
        FallingObject object = (FallingObject)getOneIntersectingObject(FallingObject.class);

        if (object != null)
        {
            getWorld().removeObject(object);
            MyWorld world = (MyWorld)getWorld();
            world.addScore();
    }
}
private void hitBadObject(){
    BadObject object =
            (BadObject)getOneIntersectingObject(BadObject.class);

        if (object != null)
        {
            MyWorld world = (MyWorld)getWorld();
            world.gameOver();
}
}
}
