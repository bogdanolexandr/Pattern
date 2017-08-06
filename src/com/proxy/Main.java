package com.proxy;

public class Main {

	public static void main(String[] args) {

		Repository repo = new ProxyRepository();
		String resource = repo.getResource();
		System.out.println(resource);

	}

}
