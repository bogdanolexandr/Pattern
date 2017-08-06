package com.facade;

public class TapeRecorder {

	private Motor motor = new Motor();
	private ReadHead readHead = new ReadHead();

	public void start() {
		motor.start();
		readHead.startReading();
	}

	public void stop() {
		readHead.stopReading();
		motor.stop();
	}

}
