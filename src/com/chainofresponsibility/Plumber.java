package com.chainofresponsibility;

public class Plumber extends Worker {

	private final String WORK_TYPE = "sewer repair";

	public Plumber(Worker worker) {
		super(worker);
	}

	@Override
	protected String getWorkType() {
		return WORK_TYPE;
	}

}
