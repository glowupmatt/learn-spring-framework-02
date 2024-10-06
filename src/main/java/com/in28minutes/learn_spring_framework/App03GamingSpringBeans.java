package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.game.GameRunner;
import com.in28minutes.game.GamingConsole;
import com.in28minutes.game.PacManGame;


@Configuration
public class App03GamingSpringBeans {
        @Bean
        public GamingConsole game() {
                PacManGame game = new PacManGame();
                return game;
        }
        
        @Bean
        public GameRunner gameRunner(GamingConsole game) {
                return new GameRunner(game);
        }
        public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                App03GamingSpringBeans.class)) {
        // context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();
}





            // // GamingConsole superContraGame = new SuperContraGame();
            // // GamingConsole marioGame = new MarioGame();
            // // GameRunner gameRunnerSuperContra = new GameRunner(superContraGame);
            // // GameRunner gameRunnerMario = new GameRunner(marioGame);
            // // gameRunnerSuperContra.run();
            // // gameRunnerMario.run();
            // GamingConsole pacManGame = new PacManGame(); // Object Creation
            // GameRunner gamePacManGame = new GameRunner(pacManGame); // injected into the class
            // // Object creating + Writing Dependencies
            // // Game is a dependency of GameRunner
            // gamePacManGame.run();
        }
}
