package com.builder;

public class Main {

	public static void main(String[] args) {

		Person person = Person.getBuilder().setAge(39).setName("Homer").setSurname("Simpson").build();
		System.out.println(person.toString());

	}

}
