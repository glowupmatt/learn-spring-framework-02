package com.in28minutes.game;

public class SuperContraGame implements GamingConsole{
	
	public SuperContraGame() {
        System.out.println("SUPER CONTRA GAME");
    }
	
	public void up() {
		System.out.println("Up");
	}
	
	public void down() {
		System.out.println("Sit down");
	}

	public void left() {
		System.out.println("Go back");
	}
	
	public void right() {
		System.out.println("Shoot a bullet");
	}
}
