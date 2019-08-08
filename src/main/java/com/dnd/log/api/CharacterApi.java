package com.dnd.log.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dnd.log.service.ICharacterService;
import com.dnd.log.character.Character;

@Component
@Path(value = "/api/v1/character")
public class CharacterApi {
	
	private ICharacterService characterService;
	
	@Autowired
	public CharacterApi(ICharacterService characterService) {
		this.characterService = characterService;
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Character> getAllCharacter(){
		return characterService.getAllCharacter();
	}
}
