import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Hero extends Actor
{
    public Hero()
    {
        GreenfootImage myImage = new GreenfootImage("man.png");
        setImage(myImage);
    }
    boolean atTop = true;
    
    public void act()
    {
        if(Greenfoot.isKeyDown("up")) {
            setLocation(100, 100);
        }
        if(Greenfoot.isKeyDown("down")) {
            setLocation(100, 300);
        }
    }
}
