package com.iterator;

import java.util.ArrayList;
import java.util.List;

public class Computer {

	private List<Hardware> hardware = new ArrayList<>();
	
	public Computer(List<Hardware> hardware) {
		this.hardware = hardware;
	}
	
	public class Iterator{
		int index = 0;
		
		public boolean hasNext() {
			if(hardware.size() > index) {
				return true;
			}
			return false;
		}
		
		public Hardware next() {
			return hardware.get(index++);
		}
	}
	
	public Iterator iterator() {
		return new Iterator();
	}
	
	
}
