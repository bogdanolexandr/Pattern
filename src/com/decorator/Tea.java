package com.decorator;

public class Tea implements Drinkable {

	@Override
	public void prepare() {
		System.out.println("prepare tea");
	}

	@Override
	public void drink() {
		System.out.println("drink tea");
	}

}
