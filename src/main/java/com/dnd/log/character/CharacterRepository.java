package com.dnd.log.character;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CharacterRepository extends CrudRepository<Character, String> {

	List<Character> findByPlayerName(String playerName);
}
