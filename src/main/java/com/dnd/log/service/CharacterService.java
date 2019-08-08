package com.dnd.log.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dnd.log.character.Character;
import com.dnd.log.dao.ICharacterDao;

public class CharacterService implements ICharacterService {
	
	private ICharacterDao characterDao;
	
	@Autowired
	public CharacterService(ICharacterDao characterDao) {
		this.characterDao = characterDao;
	}
	
	public List<Character> getAllCharacter(){
		return characterDao.getAllCharacter();
	}
}
