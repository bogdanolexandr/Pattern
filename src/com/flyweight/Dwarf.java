package com.flyweight;

public class Dwarf extends Character {

	@Override
	public void go() {
		System.out.println("Dwarf is walking");
	}

	@Override
	public void fight() {
		System.out.println("axe swinging");
	}

}
