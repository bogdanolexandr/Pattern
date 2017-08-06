package com.proxy;

public class RealRepository implements Repository {

	@Override
	public String getResource() {
		return "valuable resource";
	}

}
