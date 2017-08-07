package com.chainofresponsibility;

public abstract class Worker {

	private Worker worker;
	private final String WORK_TYPE = "nothing";

	public Worker(Worker worker) {
		this.worker = worker;
	}

	public void doWork(String work) {
		if (work.equalsIgnoreCase(getWorkType())) {
			System.out.println("I can do " + getWorkType());
			System.out.println("Doing " + getWorkType());
		} else {
			if (worker != null) {
				worker.doWork(work);
			} else {
				System.out.println("nobody can do it");
			}
		}
	};

	protected String getWorkType() {
		return WORK_TYPE;
	}

}
