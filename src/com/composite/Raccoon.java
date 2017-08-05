package com.composite;

public class Raccoon extends Animal {

	private String name;

	public Raccoon(String name) {
		this.name = name;
	}

	@Override
	public void feed() {
		System.out.println("feeding a racoon " + name);
	}

	@Override
	public void addAnimal(Animal animal) {

	}

	@Override
	public void removeAnimal(Animal animal) {

	}

}
