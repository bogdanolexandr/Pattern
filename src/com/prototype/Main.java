package com.prototype;

public class Main {

	public static void main(String[] args) {
		
		Lamb original = new Lamb(120,150,15);
		Lamb dolly = (Lamb) original.copy();
		System.out.println(dolly.equals(original));
		
	}

}
