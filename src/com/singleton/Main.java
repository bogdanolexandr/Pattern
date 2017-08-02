package com.singleton;

public class Main {

	public static void main(String[] args) {
		
		Singleton instance = Singleton.getInstance();
		Singleton anotherInstance = Singleton.getInstance();
		
		System.out.println("is the same ?  " + (instance == anotherInstance));
		
	}

}
