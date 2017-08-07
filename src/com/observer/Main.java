package com.observer;

public class Main {

	public static void main(String[] args) {

		TaxiDispatcher dispatcher = new TaxiDispatcher();
		TaxiDriver[] drivers = {new TaxiDriver("vasya", dispatcher), new TaxiDriver("petya", dispatcher), new TaxiDriver("ivan", dispatcher)};
		
		for(TaxiDriver driver : drivers) {
			driver.register();
		}
		
		dispatcher.taxiCall("khreshchatyk 1");
		
		drivers[2].remove();
		
		dispatcher.taxiCall("lypska 18");
		
		TaxiDriver hvedya = new TaxiDriver("hvedya", dispatcher);
		
		hvedya.register();
		
		dispatcher.taxiCall("lepse 22");
		
	}

}
