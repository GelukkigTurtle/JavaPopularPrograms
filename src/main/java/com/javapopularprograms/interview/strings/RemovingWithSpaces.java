package com.javapopularprograms.interview.strings;

import org.springframework.stereotype.Component;

/**
 * Created by freddy.
 * Date: 04-26-20
 */
@Component
public class RemovingWithSpaces {

    public String run(String input){

     return input.replaceAll("\\s","");
    }
}
