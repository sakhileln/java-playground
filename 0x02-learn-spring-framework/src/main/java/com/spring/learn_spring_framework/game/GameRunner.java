package com.spring.learn_spring_framework.game;

public class GameRunner {
    // Fields
    // MarioGame game;
    SuperContraGame game;
    // Constructor
    public GameRunner(SuperContraGame contraGame) {
        this.game = contraGame;
    }

    public void run() {
        // Recommended to use logging framewrok
        System.out.println("Running game: " + game);
        game.up(); game.down(); game.left(); game.right();
    }
}
