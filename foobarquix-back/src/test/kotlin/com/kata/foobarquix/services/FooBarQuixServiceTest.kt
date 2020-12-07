package com.kata.foobarquix.services;
import org.springframework.beans.factory.annotation.Autowired
import org.junit.jupiter.api.Test
import  org.junit.jupiter.api.Assertions.*
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FooBarQuixServiceTest {

    @Autowired
    lateinit var fooBarQuixService: FooBarQuixService
	@Test
	fun convertNumber() {
	 assertEquals("1", fooBarQuixService.convertNumber(1))
	assertEquals("FooFoo", fooBarQuixService.convertNumber(3))
	 assertEquals("BarBar", fooBarQuixService.convertNumber(5))
	 assertEquals("Quix", fooBarQuixService.convertNumber(7))
	 assertEquals("Foo", fooBarQuixService.convertNumber(9))
	 assertEquals("FooBar", fooBarQuixService.convertNumber(51))
	 assertEquals("BarFoo", fooBarQuixService.convertNumber(53))
	 assertEquals("FooFooFoo", fooBarQuixService.convertNumber(33))
	 assertEquals("FooQuix", fooBarQuixService.convertNumber(27))
	 assertEquals("FooBarBar", fooBarQuixService.convertNumber(15))
	}
	@Test
	fun replaceIfContainsTest(){
		assertEquals("Foo", fooBarQuixService.replaceIfContains("3"))
		assertEquals("Bar", fooBarQuixService.replaceIfContains("5"))
		assertEquals("BarFoo", fooBarQuixService.replaceIfContains("53"))
		assertEquals("Quix", fooBarQuixService.replaceIfContains("7"))
		assertEquals("Bar", fooBarQuixService.replaceIfContains("5"))
		assertEquals("", fooBarQuixService.replaceIfContains("6"))
		assertEquals("FooFoo", fooBarQuixService.replaceIfContains("33"))
	}
	
	@Test
	fun replaceIfDivTest(){
		assertEquals("Foo", fooBarQuixService.replaceIfDiv(15, 3, "Foo"))
		assertEquals("Bar", fooBarQuixService.replaceIfDiv(15, 5, "Bar"))
		assertEquals("", fooBarQuixService.replaceIfDiv(14, 3, "Foo"))
		assertEquals("", fooBarQuixService.replaceIfDiv(12, 5, "Bar"))
	}
	
}

