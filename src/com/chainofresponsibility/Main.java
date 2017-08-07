package com.chainofresponsibility;

public class Main {

	public static void main(String[] args) {
		
		Worker worker = new Plumber(new SystemAdministrator(null));
		worker.doWork("computer repair");
		worker.doWork("sewer repair");
		worker.doWork("car repair");
	}

}
