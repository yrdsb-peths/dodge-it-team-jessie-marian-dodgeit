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
        int speed = Greenfoot.getRandomNumber(4) + 3;
        setLocation(getX() - speed, getY());
        
        if (getX() <= 0)
        {
            resetApple();
        }
        

        if(isTouching(Hero.class)){
            MyWorld world = (MyWorld)getWorld();
            world.score = world.score + 1;
            world.updateScore();
            
            ghost ghost = new ghost();
            getWorld().addObject(ghost, getX(), getY());
            getWorld().removeObject(this);
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
}
