package com.javapopularprograms.interview.numbers;

import org.springframework.stereotype.Component;

/**
 * Created by freddy.
 * Date: 05-01-20
 */
@Component
public class LargestNumberLessGivenDigit {

    public int run(int number, int digit){

        char c = Integer.toString(digit).charAt(0);

        for(int i= number; i > 0; i--){
            if(Integer.toString(i).indexOf(c) == -1) //if does not contain c
            {
                return i;
            }
        }

        return 0;
    }
}
