package com.command;

public class MakeWarmerCommand implements Command {

	private Conditioner conditioner;

	public MakeWarmerCommand(Conditioner conditioner) {
		this.conditioner = conditioner;
	}

	@Override
	public void execute() {
		conditioner.makeWarmer();
	}

}
