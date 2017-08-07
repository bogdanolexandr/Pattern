package com.command;

public class MakeCooler implements Command {

	private Conditioner conditioner;

	public MakeCooler(Conditioner conditioner) {
		this.conditioner = conditioner;
	}

	@Override
	public void execute() {
		conditioner.makeCooler();
	}

}
