package com.spring.learn_spring_framework;

import com.spring.learn_spring_framework.game.GamingConsole;
import com.spring.learn_spring_framework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game() {
        var game = new PacmanGame();
        return game;
    }
}
