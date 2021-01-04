package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {
	
	FrontTimes newString = new FrontTimes();
	
	@Test
	public void TwoCopies() {
		String actual = newString.generateString("Chocolate",2);
		Assert.assertEquals("Chocolate should generate string 'ChoCho'", "ChoCho",actual);
	}
	
	@Test
	public void ThreeCopies() {
		String actual = newString.generateString("Chocolate",3);
		Assert.assertEquals("Chocolate should generate string 'ChoChoCho'", "ChoChoCho",actual);
	}
	
	@Test
	public void LessThanThreeChar() {
		String actual = newString.generateString("Ab", 5);
		Assert.assertEquals("Ab should generate string AbAbAbAbAb","AbAbAbAbAb", actual);
	}
	
	
	

}
