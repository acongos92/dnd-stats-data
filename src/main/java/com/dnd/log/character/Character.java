package com.dnd.log.character;

import com.dnd.log.constants.StringConstants;

public class Character {
	private String player_name;
	private String class_name;
	private String name;
	
	public Character() {
		player_name = StringConstants.DEFAULT_STRING_VALUE;
		class_name =  StringConstants.DEFAULT_STRING_VALUE;
		name =  StringConstants.DEFAULT_STRING_VALUE;
	}
	
	public Character(String player_name, String class_name, String name) {
		this.class_name = class_name;
		this.player_name = player_name;
		this.class_name = name;
	}

	public String getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
