package com.observer;

public class TaxiDriver implements Observer {

	private String name;
	private Observable dispatcher;

	public TaxiDriver(String name, Observable dispatcher) {
		this.name = name;
		this.dispatcher = dispatcher;
	}

	public void register() {
		dispatcher.addObserver(this);
	}

	public void remove() {
		dispatcher.removeObserver(this);
	}

	@Override
	public void manageEvent(String address) {
		System.out.println(name + " got a call " + address);
	}

}
