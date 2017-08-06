package com.decorator;

public class Main {

	public static void main(String[] args) {

		Drinkable drink = new Tea();
		drink = new SugarDecorator(drink);
		drink = new MilkDecorator(drink);

		drink.prepare();
		drink.drink();

	}

}
