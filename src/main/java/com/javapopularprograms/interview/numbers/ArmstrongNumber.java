package com.javapopularprograms.interview.numbers;

import org.springframework.stereotype.Component;

/**
 * Created by freddy.
 * Date: 04-26-20
 */
@Component
public class ArmstrongNumber {

    public boolean run(int number){
        int copyOfNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        int sum = 0;

        while(copyOfNumber != 0){
            int lastDigit = copyOfNumber %10;
            int lastDigitToThePowerOfNumberOfDigits = 1;
            for(int i =0; i< numberOfDigits; i++){
                lastDigitToThePowerOfNumberOfDigits = lastDigitToThePowerOfNumberOfDigits * lastDigit;
            }
            sum = sum + lastDigitToThePowerOfNumberOfDigits;
            copyOfNumber = copyOfNumber / 10;
        }

        return sum == number;

    }

}
