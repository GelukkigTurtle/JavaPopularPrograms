package com.javapopularprograms.interview.numbers;

import org.springframework.stereotype.Component;

/**
 * Created by freddy.
 * Date: 05-01-20
 */

@Component
public class SumAllDigits {


    public int run(int input) {
        int copyOfNumber = input;
        int sum = 0;
        while(copyOfNumber != 0){
            int lastdigit = copyOfNumber %10;
            sum = sum + lastdigit;
            copyOfNumber = copyOfNumber / 10;
        }

        return sum;
    }
}
