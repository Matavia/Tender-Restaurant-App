package com.techelevator;
import static org.junit.Assert.assertEquals;
import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

public class SameFirstLastTest {
	@Test
	public void first_Last_Not_Equal() {
		//arrange
		SameFirstLast sameFirstLast = new SameFirstLast();
		int[] nums = {1,2,3};
		//act
		boolean actual = sameFirstLast.isItTheSame(nums);
		//assert
		Assert.assertFalse("First does not equal last"
				,actual);
	}
	@Test
	public void first_Last_Is_Equal() {
		//arrange
		SameFirstLast sameFirstLast = new SameFirstLast();
		int[] nums = {1,2,3,1};
		//act
		boolean actual = sameFirstLast.isItTheSame(nums);
		//assert
		Assert.assertTrue("First does equal last"
				,actual);
	}
	@Test
	public void first_Last_Negative_Equal() {
		//arrange
		SameFirstLast sameFirstLast = new SameFirstLast();
		int[] nums = {-148,1,2,3,8,6,-148};
		//act
		boolean actual = sameFirstLast.isItTheSame(nums);
		//assert
		Assert.assertTrue("It works with negatives too"
				,actual);
	}
}