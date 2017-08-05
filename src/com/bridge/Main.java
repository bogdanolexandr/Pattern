package com.bridge;

public class Main {

	public static void main(String[] args) {

		Travel[] travels = { 
				new SeaTravel(new YachtMovement()),
				new SeaTravel(new ShipMovement()),
				new AirTravel(new AirplaneMovement())
				};
		for (Travel trip : travels) {
			trip.prepareJourney();
			trip.startJourney();
			trip.endJourney();
		}

	}

}
