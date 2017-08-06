package com.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {

	private Map<CharacterType, Character> characters;

	public CharacterFactory() {
		this.characters = new HashMap<>();
	}

	public Character getCharacter(CharacterType characterType) {
		if (!characters.containsKey(characterType)) {
			switch (characterType) {
			case DRAGON:
				addCharacter(characterType, new Dragon());
				break;
			case DWAFT:
				addCharacter(characterType, new Dwarf());
				break;
			case ELF:
				addCharacter(characterType, new Elf());
			}
		}

		return getFromCache(characterType);

	}

	private void addCharacter(CharacterType characterType, Character character) {
		characters.put(characterType, character);
	}

	private Character getFromCache(CharacterType characterType) {
		return characters.get(characterType);
	}

}
