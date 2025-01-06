package com.spring.learn_spring_framework.game;

public class GameRunner {
    // Fields
    MarioGame game;
    // Constructor
    public GameRunner(MarioGame marioGame) {
        this.game = marioGame;
    }

    public void run() {
        // Recommended to use logging framewrok
        System.out.println("Running game: " + game);
        game.up(); game.down(); game.left(); game.right();
    }
}
