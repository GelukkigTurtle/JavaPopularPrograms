package com.javapopularprograms.interview.strings;

import org.springframework.stereotype.Component;

/**
 * Created by freddy.
 * Date: 04-26-20
 */

@Component
public class ReverseAString {


    public String run(String input) {
        char[] characters = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = characters.length -1; i >= 0 ;i--){
            String character = String.valueOf(characters[i]);
            sb.append(character);
        }

        return sb.toString();
    }
}
