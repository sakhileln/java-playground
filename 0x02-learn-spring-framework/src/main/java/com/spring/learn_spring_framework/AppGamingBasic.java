package com.spring.learn_spring_framework;

import com.spring.learn_spring_framework.game.GameRunner;
import com.spring.learn_spring_framework.game.SuperContraGame;
import com.spring.learn_spring_framework.game.MarioGame;

public class AppGamingBasic {
    public static void main(String[] args) {

        var game = new MarioGame();
        //var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }
}
