package com.abstractfactory;

public class Main {

	public static void main(String[] args) {

		AbstractWardrobe classicWardrobe = new ClassicStyleWardrobe();
		AbstractWardrobe casualWardrobe = new CasualStyleWardrobe();

		Person bussinessman = new Person(classicWardrobe);

		bussinessman.goOut();

		Person teenager = new Person(casualWardrobe);

		teenager.goOut();

	}

}
