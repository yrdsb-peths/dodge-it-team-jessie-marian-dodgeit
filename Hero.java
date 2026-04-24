import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Hero extends Actor
{
    public Hero()
    {
        GreenfootImage myImage = new GreenfootImage("man.png");
        setImage(myImage);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("up")) {
            setLocation(100, getY()-4);
        }
        if(Greenfoot.isKeyDown("down")) {
            setLocation(100, getY()+4);
        }
        
        if(getY() < 50)
        {
            setLocation(100, 50);
        }
        if(getY() > 350)
        {
            setLocation(100, 350);
        }
    }
}
