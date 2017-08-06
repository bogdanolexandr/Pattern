package com.flyweight;

public class Dragon extends Character {

	@Override
	public void go() {
		System.out.println("Dragon is flying");
	}

	@Override
	public void fight() {
		System.out.println("flame eruption");
	}

}
