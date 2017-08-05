package com.bridge;

public class SeaTravel extends Travel {

	
	public SeaTravel(Movement movement) {
		super(movement);
	}

	@Override
	public void prepareJourney() {
		System.out.println("takeing bags on the board");
	}

	@Override
	public void endJourney() {
		System.out.println("get off the boat");
	}

}
