package com.dnd.log.character;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.dnd.log.constants.StringConstants;

public class CharacterEntityTest {
	
	private Character character;
	
	@BeforeEach
	public void setup() {
		character = new Character();
	}
	
	@Test
	public void itWillHaveCorrectDefaultValue() {
		assertEquals(character.getclassName(), StringConstants.DEFAULT_STRING_VALUE);
		assertEquals(character.getName(), StringConstants.DEFAULT_STRING_VALUE);
		assertEquals(character.getplayerName(), StringConstants.DEFAULT_STRING_VALUE);
	}
	
	@Test
	public void itWillHaveCorrectAssignedValues() {
		character = new Character("player", "class", "character");
		assertEquals(character.getclassName(), "class");
		assertEquals(character.getName(), "character");
		assertEquals(character.getplayerName(), "player");
	}
	
	@Test
	public void setNameWillSetName() {
		character.setclassName("newName");
		assertEquals(character.getclassName(), "newName");
	}
	
	@Test
	public void setPlayerWillSetPlayer() {
		character.setplayerName("NewPlayer");
		assertEquals(character.getplayerName(), "NewPlayer");
	}
	
	@Test
	public void setClassWillSetClass() {
		character.setclassName("newClass");
		assertEquals(character.getclassName(), "newClass");
	}
}
