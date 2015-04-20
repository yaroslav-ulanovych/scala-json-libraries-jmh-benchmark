package org.sample


case class Person(name: String, age: Int, address: Address)

case class Address(country: String, city: String)