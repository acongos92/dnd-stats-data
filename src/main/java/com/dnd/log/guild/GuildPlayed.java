package com.dnd.log.guild;

import com.dnd.log.constants.StringConstants;

public class GuildPlayed {
	private String session_quest_name;
	private String guild_name;
	
	public GuildPlayed() {
		session_quest_name = StringConstants.DEFAULT_STRING_VALUE;
		guild_name = StringConstants.DEFAULT_STRING_VALUE;
	}
	
	public GuildPlayed(String session_quest_name, String guild_name) {
		this.session_quest_name = session_quest_name;
		this.guild_name = guild_name;
	}

	public String getSession_quest_name() {
		return session_quest_name;
	}

	public void setSession_quest_name(String session_quest_name) {
		this.session_quest_name = session_quest_name;
	}

	public String getGuild_name() {
		return guild_name;
	}

	public void setGuild_name(String guild_name) {
		this.guild_name = guild_name;
	}
	
	
}
