package com.kata.foobarquix.services

import org.springframework.stereotype.Component

@Component
class FooBarQuixService {

    fun convertNumber(inputNumber: Int): String {
		var convertedNumber = ""
		convertedNumber +=  replaceIfDiv(inputNumber, 3, "Foo");
		convertedNumber +=  replaceIfDiv(inputNumber, 5, "Bar");	
		convertedNumber +=  replaceDigits(inputNumber.toString());
        return if ("".equals(convertedNumber)) inputNumber.toString() else convertedNumber
    }
	
	fun replaceDigits(inputNumber: String): String {
		return inputNumber.toCharArray().map {	
			it -> 
			    var result = when(it) {
			    '3' -> "Foo"
			    '5' -> "Bar"
			    '7' -> "Quix"
			    else -> ""	
			}
			
		   result
		}.joinToString(separator = "")
	}
	
	fun replaceIfDiv(inputNumber: Int, divisor: Int, replaceWith: String): String {
		return return if (inputNumber % divisor === 0)  replaceWith else "";
	}

}