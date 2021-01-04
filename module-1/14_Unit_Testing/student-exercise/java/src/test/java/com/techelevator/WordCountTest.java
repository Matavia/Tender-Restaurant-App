package com.techelevator;

import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import java.util.Map;
import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

public class WordCountTest {

	@Test
	public void counting_Sheep() {

		// arrange
		WordCount wordCount = new WordCount();
		String[] words = { "ba", "ba", "black", "sheep" };

		// act
		Map<String, Integer> map = wordCount.getCount(words);

		// assert
		Assert.assertEquals((Integer) 2, map.get("ba"));
		Assert.assertEquals((Integer) 1, map.get("black"));
		Assert.assertEquals((Integer) 1, map.get("sheep"));
	}

	@Test
	public void counting_Letters() {

		// arrange
		WordCount wordCount = new WordCount();
		String[] words = { "c", "b", "a" };

		// act
		Map<String, Integer> map = wordCount.getCount(words);

		// assert
		Assert.assertEquals((Integer) 1, map.get("c"));
		Assert.assertEquals((Integer) 1, map.get("b"));
		Assert.assertEquals((Integer) 1, map.get("a"));
	}

	@Test
	public void empty_String() {

		// arrange
		WordCount wordCount = new WordCount();
		String[] words = { "" };

		// act
		Map<String, Integer> map = wordCount.getCount(words);

		// assert
		Assert.assertEquals("You didn't need to add it to the array", (Integer) 0, map.get(""));
	}
}
