package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;
import com.in28minutes.learn_spring_framework.game.PacManGame;
// import com.in28minutes.learn_spring_framework.game.MarioGame;
// import com.in28minutes.learn_spring_framework.game.SuperContraGame;

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
