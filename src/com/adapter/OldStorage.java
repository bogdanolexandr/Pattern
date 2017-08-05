package com.adapter;

public final class OldStorage {

	private String data;

	public void addData(String data) {
		this.data = data;
	}

	public String loadData() {
		return data;
	}

}
