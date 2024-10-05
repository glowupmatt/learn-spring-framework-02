package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Configuration;

import com.in28minutes.game.GameRunner;
import com.in28minutes.game.GamingConsole;
import com.in28minutes.game.PacManGame;


@Configuration
public class App01GamingBasicJava {

	public static void main(String[] args) {
		// GamingConsole superContraGame = new SuperContraGame();
		// GamingConsole marioGame = new MarioGame();
		// GameRunner gameRunnerSuperContra = new GameRunner(superContraGame);
		// GameRunner gameRunnerMario = new GameRunner(marioGame);
		// gameRunnerSuperContra.run();
		// gameRunnerMario.run();
		GamingConsole pacManGame = new PacManGame(); // Object Creation
		GameRunner gamePacManGame = new GameRunner(pacManGame); // injected into the class
		// Object creating + Writing Dependencies
		// Game is a dependency of GameRunner
		gamePacManGame.run();
	}

}
