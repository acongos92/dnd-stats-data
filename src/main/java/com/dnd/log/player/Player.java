package com.dnd.log.player;

public class Player {
	private String name;
	
	public Player() {
		name = "unknown";
	}
	
	public Player(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Player name: " + name;
	}
}
