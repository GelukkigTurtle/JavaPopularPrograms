package com.javapopularprograms.interview.strings;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by freddy.
 * Date: 04-26-20
 */

@Component
public class Anagram {

    public boolean run(String s1, String s2){
        String copyS1 = s1.replaceAll("\\s","");
        String copyS2 = s2.replaceAll("\\s","");

        if(copyS1.length() != copyS2.length()) return false;
        else {
            char[] s1Array = copyS1.toLowerCase().toCharArray();
            char[] s2Array = copyS2.toLowerCase().toCharArray();
            // Sort two array
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            return Arrays.equals(s1Array, s2Array);
        }


    }
}
