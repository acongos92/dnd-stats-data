package com.dnd.log.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dnd.log.character.FakeCharacterRepository;
import com.dnd.log.dao.CharacterDao;
import com.dnd.log.dao.ICharacterDao;

@Configuration
public class DaoConfiguration {

	@Bean
	public ICharacterDao characterDao(FakeCharacterRepository fakeCharacterRepository) {
		return new CharacterDao(fakeCharacterRepository);
	}
}
