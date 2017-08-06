package com.proxy;

public class ProxyRepository implements Repository {

	private Repository repository = new RealRepository();

	@Override
	public String getResource() {
		System.out.println("doing something useful in proxy");
		return repository.getResource();
	}

}
