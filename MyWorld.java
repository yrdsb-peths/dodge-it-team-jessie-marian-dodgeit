import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super (600, 400, 1);
        setBackground("space.jpg");

        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        Hero hero2 = new Hero();
        addObject(hero, 100, 100);

        Apple apple = new Apple();
        addObject(apple, 300, 100);
        


    }
}
