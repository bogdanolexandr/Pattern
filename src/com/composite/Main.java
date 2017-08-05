package com.composite;

public class Main {

	public static void main(String[] args) {

		Animal[] raccoonsFromFirstFarm = { new Raccoon("vasya"), new Raccoon("petya"), new Raccoon("homer") };
		Animal[] raccoonsFromSecondFarm = { new Raccoon("yohoho"), new Raccoon("hohoho") };
		Animal firstRaccoonFarm = new RaccoonFarm();
		Animal secondRacconsFarm = new RaccoonFarm();
		Animal allFarms = new RaccoonFarm();
		for (Animal animal : raccoonsFromFirstFarm) {
			firstRaccoonFarm.addAnimal(animal);
		}

		for (Animal animal : raccoonsFromSecondFarm) {
			secondRacconsFarm.addAnimal(animal);
		}

		allFarms.addAnimal(firstRaccoonFarm);
		allFarms.addAnimal(secondRacconsFarm);

		allFarms.feed();

	}

}
