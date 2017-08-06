package com.flyweight;

public class Elf extends Character {

	@Override
	public void go() {
		System.out.println("Elf is riding a horse");
	}

	@Override
	public void fight() {
		System.out.println("bow shooting");
	}

}
