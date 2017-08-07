package com.chainofresponsibility;

public class SystemAdministrator extends Worker {

	private final String WORK_TYPE = "computer repair";

	public SystemAdministrator(Worker worker) {
		super(worker);
	}

	@Override
	protected String getWorkType() {
		return WORK_TYPE;
	}

}
