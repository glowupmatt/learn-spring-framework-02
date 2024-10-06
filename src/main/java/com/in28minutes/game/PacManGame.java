package com.in28minutes.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole {
	
	public PacManGame() {
        System.out.println("PAC MAN GAME");
    }
	

	public void up() {
		System.out.println("Up");
	}
	
	public void down() {
		System.out.println("Down");
	}

	public void left() {
		System.out.println("Left");
	}
	
	public void right() {
		System.out.println("Right");
	}
}
