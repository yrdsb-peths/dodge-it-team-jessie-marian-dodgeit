import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Apple(){
        GreenfootImage image = new GreenfootImage("apple1.png");
        setImage(image);
    }
    public void act()
    {
        // Add your action code here.
        MyWorld world = (MyWorld)getWorld();
        
        int speed = 3 + world.score / 20;
    
        if(speed>7)
        {
            speed = 7;
        }
        move(-speed);
        
        if (getX() <= 0)
        {
            getWorld().removeObject(this);
            return;

        }
        

        if(isTouching(Hero.class)){

            world.score++;
            world.updateScore();
            
            if(world.ghostCount < 3 && world.ghostDown == 0) {
                spawnGhost();
                world.ghostCount++;
                world.ghostDown = 40;
            }

            getWorld().removeObject(this);
        }
    }
    
    
    public void spawnGhost() {
        MyWorld world = (MyWorld)getWorld();
        ghost g = new ghost();
        int y = Greenfoot.getRandomNumber(300) + 50;
        getWorld().addObject(g, 600, y);
    }
}
