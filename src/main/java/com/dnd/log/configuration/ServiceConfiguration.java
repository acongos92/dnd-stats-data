package com.dnd.log.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.dnd.log.dao.ICharacterDao;
import com.dnd.log.service.CharacterService;
import com.dnd.log.service.ICharacterService;

@Component
public class ServiceConfiguration {

	
	
	@Bean
	public ICharacterService characterService(ICharacterDao characterDao) {
		return new CharacterService(characterDao);
	}
}
