package com.dnd.log.sessionlog;

import com.dnd.log.constants.StringConstants;

public class PlayedBy {
	private String session_quest_name;
	private String character_name;
	
	public PlayedBy() {
		session_quest_name = StringConstants.DEFAULT_STRING_VALUE;
		character_name = StringConstants.DEFAULT_STRING_VALUE;
	}
	
	public PlayedBy(String session_quest_name, String character_name) {
		this.session_quest_name = session_quest_name;
		this.character_name = character_name;
	}

	public String getSession_quest_name() {
		return session_quest_name;
	}

	public void setSession_quest_name(String session_quest_name) {
		this.session_quest_name = session_quest_name;
	}

	public String getCharacter_name() {
		return character_name;
	}

	public void setCharacter_name(String character_name) {
		this.character_name = character_name;
	}
	
	
}
