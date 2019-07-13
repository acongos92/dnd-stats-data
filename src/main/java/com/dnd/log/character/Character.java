package com.dnd.log.character;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import com.dnd.log.constants.StringConstants;

@Entity
public class Character {
	
	private String playerName;
	private String className;
	
	@Id
	private String name;
	
	public Character() {
		playerName = StringConstants.DEFAULT_STRING_VALUE;
		className =  StringConstants.DEFAULT_STRING_VALUE;
		name =  StringConstants.DEFAULT_STRING_VALUE;
	}
	
	public Character(String playerName, String className, String name) {
		this.className = className;
		this.playerName = playerName;
		this.name = name;
	}

	public String getplayerName() {
		return playerName;
	}

	public void setplayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getclassName() {
		return className;
	}

	public void setclassName(String className) {
		this.className = className;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "CHARACTER: " + name + " CLASS: " + className + " PLAYED BY: " + playerName;
	}
	
	
	
}
