package com.observer;

import java.util.ArrayList;
import java.util.List;

public class TaxiDispatcher implements Observable {

	private List<Observer> observers = new ArrayList<>();
	
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	private void notifyObservers(String address) {
		for(Observer observer : observers) {
			observer.manageEvent(address);
		}
	}

	public void taxiCall(String address) {
		notifyObservers(address);
	}
	
	
}
