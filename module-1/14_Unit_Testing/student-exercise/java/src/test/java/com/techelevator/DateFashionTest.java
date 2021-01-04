package com.techelevator;

import org.junit.Assert;
import org.junit.Test;


public class DateFashionTest {
	
	DateFashion newDate = new DateFashion();
	
	@Test
	public void OneNotStylishOneStylish() {
		int actual =newDate.getATable(5, 10);
		Assert.assertEquals(2, actual);
		
	}
	
	@Test
	public void NotStylish() {
		int actual =newDate.getATable(5, 2);
		Assert.assertEquals(0, actual);
		
	}
	
	@Test
	public void MaybeStylish() {
		int actual =newDate.getATable(5, 5);
		Assert.assertEquals(1, actual);
		
	}

}
