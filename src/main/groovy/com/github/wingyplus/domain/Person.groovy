package com.github.wingyplus.domain

class Person {
	int id
	String firstname
	String lastname
	int age

	def getFullName() {
		"${this.firstname} ${this.lastname}"
	}

	@Override
	String toString() {
		"Person: [id: ${this.id}, name: ${this.getFullName()}, age: ${this.age}]"
	}
}