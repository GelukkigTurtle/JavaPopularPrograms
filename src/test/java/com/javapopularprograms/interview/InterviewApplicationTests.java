package com.javapopularprograms.interview;

import com.javapopularprograms.interview.strings.ReverseAString;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class InterviewApplicationTests {

	Logger log = LoggerFactory.getLogger(InterviewApplicationTests.class);

	@Autowired
	ReverseAString reverseAString;


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

}
