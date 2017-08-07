package com.command;

public class SwitchOnCommand implements Command {

	private Conditioner conditioner;

	public SwitchOnCommand(Conditioner conditioner) {
		this.conditioner = conditioner;
	}

	@Override
	public void execute() {
		conditioner.switchOn();
	}

}
