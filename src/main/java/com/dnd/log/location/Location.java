package com.dnd.log.location;

import com.dnd.log.constants.StringConstants;

public class Location {
	private String name;
	
	public Location() {
		name = StringConstants.DEFAULT_STRING_VALUE;
	}
	
	public Location(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
