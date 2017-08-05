package com.adapter;

public class StorageAdapter implements StorageApi {

	private OldStorage storage;

	public StorageAdapter(OldStorage storage) {
		this.storage = storage;
	}

	@Override
	public void setData(String data) {
		storage.addData(data);

	}

	@Override
	public String getData() {
		return storage.loadData();
	}

}
