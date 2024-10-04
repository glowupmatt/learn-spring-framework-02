package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		GamingConsole superContraGame = new SuperContraGame();
		GamingConsole marioGame = new MarioGame();
		GamingConsole pacManGame = new PacManGame();
		GameRunner gameRunnerSuperContra = new GameRunner(superContraGame);
		GameRunner gameRunnerMario = new GameRunner(marioGame);
		GameRunner gamePacManGame = new GameRunner(pacManGame);
		gameRunnerSuperContra.run();
		gameRunnerMario.run();
		gamePacManGame.run();
	}

}
