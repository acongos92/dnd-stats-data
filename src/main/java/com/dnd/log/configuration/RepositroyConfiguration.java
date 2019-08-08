package com.dnd.log.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dnd.log.character.FakeCharacterRepository;

@Configuration
public class RepositroyConfiguration {
	
	@Bean
	public FakeCharacterRepository fakeCharacterRepositroy() {
		return new FakeCharacterRepository();
	}
}
