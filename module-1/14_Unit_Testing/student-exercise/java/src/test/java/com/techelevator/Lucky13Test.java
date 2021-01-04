package com.techelevator;
import static org.junit.Assert.assertEquals;
import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

public class Lucky13Test {
	@Test
	public void no_1_No_3() {
	//arrange
	Lucky13 lucky13 = new Lucky13();
	int[] nums = {0,2,4};
		//act
	boolean actualOut = lucky13.getLucky(nums);
	//assert
	Assert.assertTrue(
			"No Unlucky Numbers",
			actualOut);	
	}
	@Test
	public void we_Are_Unlucky() {
	//arrange
	Lucky13 lucky13 = new Lucky13();
	int[] nums = {1,2,3};
		//act
	boolean actualOut = lucky13.getLucky(nums);
	//assert
	Assert.assertFalse(
			"You have Unlucky Numbers",
			actualOut);	
	}
	@Test
	public void one_Unlucky() {
	//arrange
	Lucky13 lucky13 = new Lucky13();
	int[] nums = {1,2,4};
		//act
	boolean actualOut = lucky13.getLucky(nums);
	//assert
	Assert.assertFalse(
			"You have one Unlucky Number",
			actualOut);	
	}
	@Test
	public void negative_No_Unlucky() {
	//arrange
	Lucky13 lucky13 = new Lucky13();
	int[] nums = {0,-2,-4};
		//act
	boolean actualOut = lucky13.getLucky(nums);
	//assert
	Assert.assertTrue(
			"You have no Unlucky Numbers",
			actualOut);	
	}
	@Test
	public void null_Unlucky() {
	//arrange
	Lucky13 lucky13 = new Lucky13();
	int[] nums = null;
		//act
	boolean actualOut = lucky13.getLucky(nums);
	//assert
	Assert.assertTrue(
			"You are null",
			actualOut);	
	}
}