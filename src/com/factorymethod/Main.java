package com.factorymethod;

public class Main {

	public static void main(String[] args) {
		
		AnimalCreator[] creators = {new DogCreator(),new CatCreator()};
		for(AnimalCreator creator : creators) {
			Animal animal = creator.createAnimal();
			animal.speak();
		}
	}

}
