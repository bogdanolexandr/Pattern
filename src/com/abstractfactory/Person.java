package com.abstractfactory;

public class Person {

	private UpperPart upperPart;
	private LowerPart lowerPart;

	public Person(AbstractWardrobe wardrobe) {
		this.upperPart = wardrobe.takeUpperPart();
		this.lowerPart = wardrobe.takeLowerPart();
	}

	public void goOut() {
		System.out.println("I'm wearing " + lowerPart.clothes() + " and " + upperPart.clothes());
	}

}
