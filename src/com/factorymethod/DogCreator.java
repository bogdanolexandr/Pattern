package com.factorymethod;

public class DogCreator extends AnimalCreator {

	@Override
	public Animal createAnimal() {
		return new Dog();
	}

}
