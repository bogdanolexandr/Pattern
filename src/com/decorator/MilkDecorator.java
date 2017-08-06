package com.decorator;

public class MilkDecorator implements Drinkable {

	private Drinkable drink;

	public MilkDecorator(Drinkable drink) {
		this.drink = drink;
	}

	@Override
	public void prepare() {
		drink.prepare();
		System.out.println("add milk");
	}

	@Override
	public void drink() {
		drink.drink();
	}

}
