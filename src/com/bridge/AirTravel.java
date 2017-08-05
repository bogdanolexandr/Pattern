package com.bridge;

public class AirTravel extends Travel {

	public AirTravel(Movement movement) {
		super(movement);
	}

	@Override
	public void prepareJourney() {
		System.out.println("taking bags on the plane");
	}

	@Override
	public void endJourney() {
		System.out.println("get off the plane");
	}

}
