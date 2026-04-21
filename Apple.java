import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Apple extends Actor
{
    public Apple(){
        GreenfootImage image = new GreenfootImage("apple1.png");
        setImage(image);
    }
    public void act()
    {
        // Add your action code here.
        move(-2);
        
    }
}
