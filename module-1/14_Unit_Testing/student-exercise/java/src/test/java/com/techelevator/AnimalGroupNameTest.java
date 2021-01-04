
package com.techelevator;


import org.junit.Assert;
import org.junit.Test;




public class AnimalGroupNameTest {
	AnimalGroupName animalGroup = new AnimalGroupName();
	
	@Test
	public void NullIsUnknown(){
		String expectedName = "unknown";
		String actualName = animalGroup.getHerd(null);
		Assert.assertEquals("Null should equal unknown", expectedName, actualName);
	
	}
	
	@Test
	public void EmptyIsUnknown(){

		String expectedName = "unknown";
		String actualName = animalGroup.getHerd("");
		Assert.assertEquals("Null should equal unknown", expectedName, actualName);
	
	}
	
	@Test
	public void UnlistedIsUnknown(){
	
		String expectedName = "unknown";
		String actualName = animalGroup.getHerd("duck");
		Assert.assertEquals("Null should equal unknown", expectedName, actualName);
	
	}

	
	@Test
	public void CorrectGroupCaseInsensitive(){
	
	String expectedName = "Crash";
	String actualName = animalGroup.getHerd("RhInO");
	Assert.assertEquals("Null should equal unknown", expectedName, actualName);
	}
	
	@Test
	public void CorrectGroupUpperCase(){
	String expectedName = "Tower";
	String actualName = animalGroup.getHerd("GIRAFFE");
	Assert.assertEquals("GIRAFFE should return 'Tower' ", expectedName, actualName);
	}
	

	 

}
