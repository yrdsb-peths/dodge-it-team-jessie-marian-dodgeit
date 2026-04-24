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
        
        int speed = 2 + world.score / 20;
        
        if(speed>6)
        {
            speed = 6;
        }
        move(-speed);
        
        if (isTouching(Hero.class)) {

            world.lives--;
            world.updateLives();
            
            if(world.lives <= 0) {
                world.showText("GAME OVER", 300, 200);
                Greenfoot.stop();
                return;
            }
            getWorld().removeObject(this);
            return;
            
        }
        
        if(getX() <= 0)
        {
            world.ghostCount--;
            getWorld().removeObject(this);
        }
        
    }
    
}
