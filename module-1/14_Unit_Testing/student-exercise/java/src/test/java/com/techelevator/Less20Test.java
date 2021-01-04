package com.techelevator;
import static org.junit.Assert.assertEquals;
import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
public class Less20Test {
	@Test
	public void happy_Path() {
		//arrange
	Less20 less20 = new Less20();
	int numToUse = 18;
	boolean expectedResult = true;
	// act
	boolean divisable = less20.isLessThanMultipleOf20(numToUse);
		//assert
	Assert.assertTrue(
			"One or Two less than multiple of 20", 
			divisable);
	}
	@Test
	public void one_Less_Than_Multiple_Of_20() {
		//arrange
	Less20 less20 = new Less20();
	int numToUse = 19;
	boolean expectedResult = true;
	// act
	boolean divisable = less20.isLessThanMultipleOf20(numToUse);
		//assert
	Assert.assertTrue(
			"One less than multiple of 20", 
			divisable);
	}
}