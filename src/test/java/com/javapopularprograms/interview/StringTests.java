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

	@Autowired
	CountCharacterOccurrences countCharacterOccurrences;


	@Test
	void contextLoads() {
	}

	//1) How to reverse a string in java?
	@Test
	public void reverseAString(){
		String input = "hola me llamo freddy";
		String output = reverseAString.run(input);
		log.info("Original {}", input);
		log.info("Reversed {}",output);

		assertEquals("ydderf omall em aloh",output);
	}

	//2) How to create a pyramid of numbers in java?
	@Test
	public void createAPyramid(){
		int numberOfRows = 5;
		numberPyramid.run(numberOfRows);

	}

	//3) How do you remove all white spaces from a string in java?
	@Test
	public void removingWhiteSpaces(){
		String input = "hola me llamo freddy";
		String output = removingWithSpaces.run(input);
		log.info("Original {}", input);
		log.info("Reversed {}",output);

		assertEquals("holamellamofreddy",output);
	}

	//4) How to find duplicate characters in a string in java?
	@Test
	public void findDuplicates() {
		findDuplicates.run("bitter butter");
	}

	//6) Anagram program in java
	@Test
	void isAnagram() {
		String s1 = "Mother In Law";
		String s2 = "Hitler Woman";

		boolean result = anagram.run(s1,s2);
		assertTrue(result);
	}

	//12) How to count occurrences of each character in a string in java?
	@Test
	void countOccurrences(){
		String input = "Java J2EE Java JSP J2EE";
		countCharacterOccurrences.run(input);
	}

}
