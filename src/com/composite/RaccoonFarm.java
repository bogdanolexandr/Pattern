package com.composite;

import java.util.ArrayList;
import java.util.List;

public class RaccoonFarm extends Animal {

	private List<Animal> raccoons = new ArrayList<>();

	@Override
	public void feed() {
		for (Animal raccoon : raccoons) {
			raccoon.feed();
		}
	}

	@Override
	public void addAnimal(Animal animal) {
		raccoons.add(animal);
	}

	@Override
	public void removeAnimal(Animal animal) {
		raccoons.remove(animal);
	}

}
