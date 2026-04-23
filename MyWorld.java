import greenfoot.*;

public class MyWorld extends World {
    public int score = 0;
    public int lives = 3;
    public int ghostCount = 0;
    
    public int lastGhost = 100;
    public int lastGhostY = -1;

    public MyWorld() {
        super (600, 400, 1);
        
        setBackground("bluerock.jpg");
        showText("Score: 0", 100, 20);
        showText("Lives: 3", 500, 20);
        
        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        
        for (int i = 0; i <10; i++) {
            Apple apple = new Apple();
            int y;
            if(Greenfoot.getRandomNumber(2) == 0) {
                y = 100;
            } else {
                y = 300;
            }
            addObject(apple, 300 + i*150, y);
        }
        
 
    }

    public void updateScore() {
        showText("Score: " + score, 100, 20);
    }
    
    public void updateLives() {
        showText("Lives: " + lives, 500, 20);
    }
}
