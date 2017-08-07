package com.iterator;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Hardware[] hardware = {new Motherboard(), new Processor(), new Ram(), new VideoCard(), new HardDisk()};
		Computer computer = new Computer(Arrays.asList(hardware));
		Computer.Iterator iterator = computer.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().name());
		}
		
		
		
	}

}
