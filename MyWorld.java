import greenfoot.*;

public class MyWorld extends World {
    public int score = 0;
    public int lives = 3;
    public int ghostCount = 0;
    
    int ghostDown = 0;
    
    public int lastGhost = 100;
    public int lastGhostY = -1;

    public MyWorld() {
        super (600, 400, 1);
        
        setBackground("bluerock.jpg");
        showText("Score: 0", 100, 20);
        showText("Lives: 3", 500, 20);
        
        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        
        for (int i = 0; i < 8; i++) {
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

    public void act() {
        stopGame();
        if(ghostDown > 0) {
            ghostDown--;
        }
    }
    public void updateScore() {
        showText("Score: " + score, 100, 20);
    }

    public void stopGame() {
        
        if(score >= 33) {
            Smile smile = new Smile();
            addObject(smile, 300, 160);
            
            showText("You Win!", 300, 200);
            Greenfoot.stop();
        }
    }
    public void updateLives() {
        showText("Lives: " + lives, 500, 20);
    }
}
