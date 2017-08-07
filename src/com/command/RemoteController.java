package com.command;

import java.util.HashMap;
import java.util.Map;

public class RemoteController {

	private Map<String, Command> commands = new HashMap<>();

	public RemoteController(Conditioner conditioner) {
		commands.put("on", new SwitchOnCommand(conditioner));
		commands.put("off", new SwitchOffCommand(conditioner));
		commands.put("warmer", new MakeWarmerCommand(conditioner));
		commands.put("cooler", new MakeCooler(conditioner));
	}

	public void switchOn() {
		commands.get("on").execute();
	}

	public void switchOff() {
		commands.get("off").execute();
	}

	public void makeWarmer() {
		commands.get("warmer").execute();
	}

	public void makeCooler() {
		commands.get("cooler").execute();
	}

}
