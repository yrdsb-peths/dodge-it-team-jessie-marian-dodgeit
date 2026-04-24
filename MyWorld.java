import greenfoot.*;

public class MyWorld extends World {
    public int score = 0;
    public int lives = 3;
    public int ghostCount = 0;
    
    int appleTimer = 0;
    int ghostDown = 0;
    
    public MyWorld() {
        super (600, 400, 1);
        
        setBackground("bluerock.jpg");
        showText("Score: 0", 100, 20);
        showText("Lives: 3", 500, 20);
        
        Hero hero = new Hero();
        addObject(hero, 100, 200);
        
    }
        

    public void act() {
        spawnApple();
        updateTimers();
        checkWin();
    }
    public void spawnApple() {
        appleTimer++;
        if(appleTimer > 60) {
            Apple apple = new Apple();
            int y = Greenfoot.getRandomNumber (300) + 50;
            addObject(apple, 600, y);
            appleTimer = 0;
        }
    }
    
    public void updateTimers() {
        if (ghostDown > 0)
        {
            ghostDown--;
        }
    }
    public void updateScore() {
        showText("Score: " + score, 100, 20);
    }

    public void updateLives() {
        showText("Lives: " + lives, 500, 20);
    }
    
    public void checkWin() {
        if(score >= 20) {
            Smile smile = new Smile();
            addObject(smile, 300, 150);
            showText("YOU WIN!", 300, 200);
            Greenfoot.stop();
        }
    }
}
