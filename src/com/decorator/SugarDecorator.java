package com.decorator;

public class SugarDecorator implements Drinkable {

	private Drinkable drink;

	public SugarDecorator(Drinkable drink) {
		this.drink = drink;
	}

	@Override
	public void prepare() {
		drink.prepare();
		System.out.println("add sugar");
	}

	@Override
	public void drink() {
		drink.drink();
	}

}
