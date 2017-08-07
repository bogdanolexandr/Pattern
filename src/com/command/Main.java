package com.command;

public class Main {

	public static void main(String[] args) {

		Conditioner conditioner = new Conditioner();

		RemoteController remoteController = new RemoteController(conditioner);
		remoteController.switchOn();
		remoteController.makeCooler();
		remoteController.makeWarmer();
		remoteController.switchOff();

	}

}
