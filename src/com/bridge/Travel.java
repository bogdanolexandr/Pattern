package com.bridge;

public abstract class Travel {

	private Movement movement;

	public Travel(Movement movement) {
		this.movement = movement;
	}

	public abstract void prepareJourney();

	public void startJourney() {
		movement.go();
	}

	public abstract void endJourney();

}
