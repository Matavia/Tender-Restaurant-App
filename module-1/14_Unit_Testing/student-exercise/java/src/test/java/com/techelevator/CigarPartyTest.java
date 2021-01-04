package com.techelevator;

import org.junit.Assert;
import org.junit.Test;


public class CigarPartyTest {
	
	CigarParty newParty = new CigarParty();

	@Test
	public void Below40() {
		boolean actual = newParty.haveParty(30,false);
		
		Assert.assertEquals( "30 should return false", false, actual);
		
	}
	
	@Test
	public void Between4060() {
		boolean actual = newParty.haveParty(50,false);
		
		Assert.assertEquals( "50 should return false", true, actual);
	
	}
	
	@Test
	public void AfterRangeOnWeekend() {
		boolean actual = newParty.haveParty(70,true);
		Assert.assertEquals( "70 should return false", true, actual);
	
	}
	
	
}
