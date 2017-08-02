package com.factorymethod;

public class CatCreator extends AnimalCreator {

	@Override
	public Animal createAnimal() {
		return new Cat();
	}

}
