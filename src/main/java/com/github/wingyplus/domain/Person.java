package com.github.wingyplus.domain;

public class Person {
	private int id;
	private String firstname;
	private String lastname;
	private int age;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public String getFullName() {
		return this.getFirstname() + " " + this.getLastname();
	}

	@Override
	public String toString() {
		return "Person: [id: " + this.getId() + ", name: " + this.getFullName() + ", age: " + this.getAge() + "]";
	}
}