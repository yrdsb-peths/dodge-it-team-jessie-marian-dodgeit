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
        move(-2);
        
        move(-5);
        
        if(getX() <= 0)
        {
            resetApple();
        }
        if(isTouching(Hero.class)){
            ghost ghost = new ghost();
            getWorld().addObject(ghost, 300, 200);
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
