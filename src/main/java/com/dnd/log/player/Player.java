package com.dnd.log.player;

import com.dnd.log.constants.StringConstants;

public class Player {
	private String name;
	
	public Player() {
		name =  StringConstants.DEFAULT_STRING_VALUE;
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
