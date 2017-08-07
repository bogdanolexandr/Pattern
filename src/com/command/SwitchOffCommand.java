package com.command;

public class SwitchOffCommand implements Command {

	private Conditioner conditioner;

	public SwitchOffCommand(Conditioner conditioner) {
		this.conditioner = conditioner;
	}

	@Override
	public void execute() {
		conditioner.switchOff();
	}

}
