package com.in28minutes.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running game: %s" + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
	
	
}