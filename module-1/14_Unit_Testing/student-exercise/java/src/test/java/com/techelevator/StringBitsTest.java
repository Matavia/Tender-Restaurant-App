package com.techelevator;
import static org.junit.Assert.assertEquals;
import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
public class StringBitsTest {
	@Test
	public void happy_Path() {
		//arrange
		StringBits stringBits = new StringBits();
		String str = "Hello";
		String endResult = "Hlo";
		//act
		String actual = stringBits.getBits(str);
		//assert
		Assert.assertEquals("Every other character",
				endResult,
				actual);
	}
	@Test
	public void long_String_In_Caps() {
		//arrange
		StringBits stringBits = new StringBits();
		String str = "HEEOLOLEO";
		String endResult = "HELLO";
		//act
		String actual = stringBits.getBits(str);
		//assert
		Assert.assertEquals("WORKS IN ALL CAPS",
				endResult,
				actual);
	}
	@Test
	public void empty_String_Returns_Empty() {
		//arrange
		StringBits stringBits = new StringBits();
		String str = " ";
		String endResult = " ";
		//act
		String actual = stringBits.getBits(str);
		//assert
		Assert.assertEquals("empty string returns empty string",
				endResult,
				actual);
	}
	@Test
	public void null_String_Returns_Null() {
		//arrange
		StringBits stringBits = new StringBits();
		String str = null;
		String endResult = "";
		//act
		String actual = stringBits.getBits(str);
		//assert
		Assert.assertEquals("null string returns empty string",
				endResult,
				actual);
	}
}