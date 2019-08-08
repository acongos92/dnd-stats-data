package com.dnd.log.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.dnd.log.character.Character;

import com.dnd.log.character.CharacterRepository;

public class CharacterDao implements ICharacterDao{
	
	private CharacterRepository repository;
	
	@Autowired
	public CharacterDao(CharacterRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public List<Character> getAllCharacter() {
		return repository.findAll();
	}
	
}
