package com.javapopularprograms.interview.numbers;

import org.springframework.stereotype.Component;

/**
 * Created by freddy.
 * Date: 05-01-20
 */
@Component
public class IsBinary {

    public boolean run(int input){

        char[] array = String.valueOf(input).toCharArray();

        for(Character c: array){

            if(c !=  '1' &&  c != '0') return false;

        }

        return true;
    }

}
