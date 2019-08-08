package com.dnd.log.character;

import com.dnd.log.character.Character;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class FakeCharacterRepository implements CharacterRepository{
	private Map<String, Character> fakeDb;
	
	public FakeCharacterRepository() {
		fakeDb = new HashMap<String, Character>();
		String name = "kli";
		fakeDb.put(name, new Character(name, "barbarian", "player"));
	}
	@Override
	public <S extends Character> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Character> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Character> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Character> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Character entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Character> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Character> findByPlayerName(String playerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Character> findAll() {
		// TODO Auto-generated method stub
		return new LinkedList<Character>(fakeDb.values());
	}

}
