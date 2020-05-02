package com.javapopularprograms.interview.strings;

import org.springframework.stereotype.Component;

/**
 * Created by freddy.
 * Date: 05-01-20
 */
@Component
public class ReverseEachWord {

    public String run(String text){

        String[] tokens = text.split(" ");
        StringBuilder reversedText = new StringBuilder();

        for(String token : tokens){
            StringBuilder sb = new StringBuilder(token);
            reversedText.append(sb.reverse());
            reversedText.append(" ");

        }

        System.out.println("Original: ");
        System.out.println(text);
        System.out.println("Reversed: ");
        System.out.println(reversedText);

        return reversedText.toString();


    }
}
