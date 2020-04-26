package com.javapopularprograms.interview;

import com.javapopularprograms.interview.strings.ReverseAString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InterviewApplication {


	public static void main(String[] args) {
		ApplicationContext applicationContext =  SpringApplication.run(InterviewApplication.class, args);
	}

}
