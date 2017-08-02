package com.builder;

public class Person {

	private int age;
	private String name;
	private String surname;

	private Person(int age, String name, String surname) {
		this.age = age;
		this.name = name;
		this.surname = surname;
	}

	public static Builder getBuilder() {
		return new Builder();
	}

	public static class Builder {

		private int age;
		private String name;
		private String surname;

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setSurname(String surname) {
			this.surname = surname;
			return this;
		}

		public Person build() {
			return new Person(age, name, surname);
		}

	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", surname=" + surname + "]";
	}

}
