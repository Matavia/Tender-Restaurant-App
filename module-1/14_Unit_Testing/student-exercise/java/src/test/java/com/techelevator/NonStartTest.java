package com.techelevator;

import static org.junit.Assert.assertEquals;
import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

public class NonStartTest {

	@Test
	public void happy_Path() {
		
		// arrange
		NonStart nonStart = new NonStart();
		String one = "Hello";
		String two = "There";
		String expected = "ellohere";
		
		// act
		String actual = nonStart.getPartialString(one, two);
		
		// assert
		Assert.assertEquals("Cincatinated String should omit the first letter", expected, actual);
	}

	@Test
	public void string_With_Number() {
		
		// arrange
		NonStart nonStart = new NonStart();
		String one = "shot1";
		String two = "java";
		String expected = "hot1ava";
		
		// act
		String actual = nonStart.getPartialString(one, two);
		
		// assert
		Assert.assertEquals("Cincatinated String should omit the first letter", expected, actual);
	}

	@Test
	public void one_Length_String() {
		
		// arrange
		NonStart nonStart = new NonStart();
		String one = "h";
		String two = "T";
		String expected = "";
		
		// act
		String actual = nonStart.getPartialString(one, two);
		
		// assert
		Assert.assertEquals("Cincatinated String should omit the first letter", expected, actual);
	}

	@Test
	public void one_Empty_String() {
		
		// arrange
		NonStart nonStart = new NonStart();
		String one = "";
		String two = "Shots";
		String expected = "hots";
		
		// act
		String actual = nonStart.getPartialString(one, two);
		
		// assert
		Assert.assertEquals("Concatinated String should omit the first letter", expected, actual);
	}

}