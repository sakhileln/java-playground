package com.spring.learn_spring_framework;

import com.spring.learn_spring_framework.game.GameRunner;
import com.spring.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasic {
    public static void main(String[] args) {

        // var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();

    }
}
