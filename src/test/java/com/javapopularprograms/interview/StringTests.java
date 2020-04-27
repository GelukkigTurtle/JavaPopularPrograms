package com.javapopularprograms.interview;

import com.javapopularprograms.interview.strings.*;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class StringTests {

	Logger log = LoggerFactory.getLogger(StringTests.class);

	@Autowired
	ReverseAString reverseAString;

	@Autowired
	NumberPyramid numberPyramid;

	@Autowired
	RemovingWithSpaces removingWithSpaces;

	@Autowired
	FindDuplicates findDuplicates;

	@Autowired
	Anagram anagram;


	@Test
	void contextLoads() {
	}

	@Test
	public void reverseAString(){
		String input = "hola me llamo freddy";
		String output = reverseAString.run(input);
		log.info("Original {}", input);
		log.info("Reversed {}",output);

		assertEquals("ydderf omall em aloh",output);
	}

	@Test
	public void createAPyramid(){
		int numberOfRows = 5;
		numberPyramid.run(numberOfRows);

	}

	@Test
	public void removingWhiteSpaces(){
		String input = "hola me llamo freddy";
		String output = removingWithSpaces.run(input);
		log.info("Original {}", input);
		log.info("Reversed {}",output);

		assertEquals("holamellamofreddy",output);
	}

	@Test
	public void findDuplicates() {
		findDuplicates.run("bitter butter");
	}

	@Test
	void isAnagram() {
		String s1 = "Mother In Law";
		String s2 = "Hitler Woman";

		boolean result = anagram.run(s1,s2);
		assertTrue(result);
	}

}
