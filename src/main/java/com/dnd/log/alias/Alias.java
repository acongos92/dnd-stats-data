package com.dnd.log.alias;

import com.dnd.log.constants.StringConstants;

public class Alias {
	public String name;
	public String player_name;
	
	public Alias() {
		player_name = StringConstants.DEFAULT_STRING_VALUE;
		name = StringConstants.DEFAULT_STRING_VALUE;
	}
	
	public Alias(String player_name, String name) {
		this.player_name = name;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	
	
}
