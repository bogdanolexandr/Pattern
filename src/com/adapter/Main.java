package com.adapter;

public class Main {

	public static void main(String[] args) {

		OldStorage oldStorage = new OldStorage();
		StorageApi storage = new StorageAdapter(oldStorage);
		storage.setData("hello world");

		System.out.println(storage.getData());

	}

}
