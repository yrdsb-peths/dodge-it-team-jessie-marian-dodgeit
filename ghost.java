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
        MyWorld world = (MyWorld)getWorld();
        
        int speed = 1 + world.score / 2;
        move(-speed);
        
        
        if (isTouching(Hero.class)) {

            world.lives = world.lives - 1;
            world.updateLives();
            
            if(world.lives <= 0) {
                world.showText("GAME OVER", 300, 200);
                Greenfoot.stop();
                return;
            }
            getWorld().removeObject(this);
            return;
            
        }
        
    }
    
}
