package com.dnd.log.guild;

import com.dnd.log.constants.StringConstants;

public class Guild {
	private String name;
	private String owner_name;
	
	public Guild() {
		name = StringConstants.DEFAULT_STRING_VALUE;
		owner_name = StringConstants.DEFAULT_STRING_VALUE;
	}
	
	public Guild(String name, String owner_name) {
		this.name = name;
		this.owner_name = owner_name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	
	
}
