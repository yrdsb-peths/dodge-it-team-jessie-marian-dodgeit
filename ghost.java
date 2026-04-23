import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class ghost extends Actor
{
    /**
     * Act - do whatever the ghost wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ghost()
    {
        GreenfootImage myImage = new GreenfootImage("skull.png");
        setImage(myImage);
    }
    
    public void act()
    {
        // Add your action code here.
        setLocation(getX() - 3, getY());
        
        if (isTouching(Hero.class)) {
            MyWorld world = (MyWorld)getWorld();
            world.score = world.score - 1;
            
            if(world.score < 0) {
                world.score = 0;
            }
            
            world.updateScore();
            
            getWorld().removeObject(this);
        }
    }
    
}
