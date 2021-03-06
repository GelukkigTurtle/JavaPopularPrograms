package com.javapopularprograms.interview;

import com.javapopularprograms.interview.arrays.FindDuplicatesInArray;
import com.javapopularprograms.interview.arrays.FindMissingNumber;
import com.javapopularprograms.interview.arrays.IntersectionOfTwo;
import com.javapopularprograms.interview.numbers.*;
import com.javapopularprograms.interview.strings.FindDuplicates;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by freddy.
 * Date: 04-26-20
 */
@SpringBootTest
public class NumberTests {

    @Autowired
    ArmstrongNumber armstrongNumber;

    @Autowired
    SumAllDigits sumAllDigits;

    @Autowired
    LargestNumberLessGivenDigit largestNumberLessGivenDigit;

    @Autowired
    IsBinary isBinary;

    @Autowired
    TrigonometricMethods trigonometricMethods;



    //7) Armstrong number program in java
    @Test
    void checkIfIsArmstrongNumber(){
        int number = 153;
        // 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
        // 54748 = 5^5 + 4^5 + 7^5 + 4^5 + 8^5 = 3125 + 1024 + 16807 + 1024 + 32768 = 54748
        assertTrue(armstrongNumber.run(number));
    }

    //9) How to find sum of all digits of a number in java?
    @Test
    void sumAllDigitsOfNumber(){
        int number = 12345;

        assertEquals(15, sumAllDigits.run(number));
    }

    //13) How to find largest number less than a given number and without a given digit?
    @Test
    void findLargestNumberLessThanDigit(){
        int number = 145;
        int digit  = 4;

        assertEquals(139,largestNumberLessGivenDigit.run(number,digit));
    }

    //17) How to check whether given number is binary or not?
    @Test
    void checkIfisBinary(){
       int input = 110010110;
       assertTrue(isBinary.run(input));
    }

    //21) How to find trigonometric values of an angle in java?
    @Test
    void doTrigonometricOfAngle(){
        double angle = 90.0;
        trigonometricMethods.run(angle);
    }






}
