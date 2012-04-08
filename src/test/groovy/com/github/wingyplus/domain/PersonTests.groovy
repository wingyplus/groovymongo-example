package com.github.wingyplus.domain

import spock.lang.*

class PersonTests extends Specification {
	
	def 'get fullname'() {
		// given is alias of setup block
		given: 'new object Person'
		def person = new Person()

		when: 'assign properties to obj'
		person.id = 1
		person.firstname = 'Thanabodee'
		person.lastname = 'Charoenpiriyakij'
		person.age = 22

		then: 'test get fullname'
		person.getFullName() == 'Thanabodee Charoenpiriyakij'
	}

	def 'return all data of person with toString()'() {
		given:
		def person = new Person()

		when:
		person.id = 1
		person.firstname = 'Thanabodee'
		person.lastname = 'Charoenpiriyakij'
		person.age = 22

		then:
		person.toString() == 'Person: [id: 1, name: Thanabodee Charoenpiriyakij, age: 22]'
	}

}