package com.flyweight;

public class Main {

	public static void main(String[] args) {
		
		CharacterFactory factory = new CharacterFactory();
		CharacterType[] characters = {CharacterType.DRAGON, CharacterType.DWAFT, CharacterType.DWAFT, CharacterType.ELF, CharacterType.ELF};
		Character character = null;
		for(CharacterType characterType : characters) {
			character = factory.getCharacter(characterType);
			character.go();
			character.fight();
		}
		
	}

}
