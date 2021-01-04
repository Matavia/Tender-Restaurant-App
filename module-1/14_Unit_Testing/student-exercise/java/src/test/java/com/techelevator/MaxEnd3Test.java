package com.techelevator;

import static org.junit.Assert.assertEquals;
import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

public class MaxEnd3Test {
	
	@Test
	public void largest_Final_Number() {
		
		//arrange
		MaxEnd3 maxEnd3 = new MaxEnd3();
		int[] nums = {1,2,3};
		int[] finalArray = {3,3,3};
		
		///act
		int[] actual = maxEnd3.makeArray(nums);
		
		// assert
		Assert.assertArrayEquals("All numbers become the largest",
				finalArray,
				actual);
}
	@Test
	public void largest_First_Number() {
		
		//arrange
		MaxEnd3 maxEnd3 = new MaxEnd3();
		int[] nums = {11,2,3};
		int[] finalArray = {11,11,11};
		
		///act
		int[] actual = maxEnd3.makeArray(nums);
		
		// assert
		Assert.assertArrayEquals("All numbers become the largest",
				finalArray,
				actual);
}
	@Test
	public void largest_With_A_Negative() {
		
		//arrange
		MaxEnd3 maxEnd3 = new MaxEnd3();
		int[] nums = {-20,-33,3};
		int[] finalArray = {3,3,3};
		
		///act
		int[] actual = maxEnd3.makeArray(nums);
		
		// assert
		Assert.assertArrayEquals("All numbers become the largest",
				finalArray,
				actual);
}
}