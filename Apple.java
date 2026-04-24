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
            resetApple();
        }
        

        if(isTouching(Hero.class)){

            world.score = world.score + 1;
            world.updateScore();
            
            if(world.ghostCount < 3 && world.ghostDown == 0) {
                spawnGhost();
                world.ghostCount++;
                world.ghostDown = 30;
            }

            resetApple();
        }
    }
    
    public void resetApple(){
        int num = Greenfoot.getRandomNumber(2);
        if (num == 0){
            setLocation(600,100);
        } else {
            setLocation(600,300);
        }
    }
    
    public void spawnGhost() {
        MyWorld world = (MyWorld)getWorld();
        ghost g = new ghost();
        int y;
    
        if(Greenfoot.getRandomNumber(2) == 0) {
            y = 100;
        } else {
            y = 300;
        }
        
        if (y == world.lastGhostY) {
            if (y == 100) {
                y = 300;
            } else {
                y = 100;
            }
        }
        world.lastGhostY = y;
        getWorld().addObject(g, 600, y);
    }
}
