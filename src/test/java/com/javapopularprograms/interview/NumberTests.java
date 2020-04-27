package com.javapopularprograms.interview;

import com.javapopularprograms.interview.arrays.FindDuplicatesInArray;
import com.javapopularprograms.interview.numbers.ArmstrongNumber;
import com.javapopularprograms.interview.strings.FindDuplicates;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
    FindDuplicatesInArray findDuplicatesInArray;

    @Test
    void checkIfIsArmstrongNumber(){
        int number = 153;
        // 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
        // 54748 = 5^5 + 4^5 + 7^5 + 4^5 + 8^5 = 3125 + 1024 + 16807 + 1024 + 32768 = 54748
        assertTrue(armstrongNumber.run(number));
    }

    @Test
    void checkIfHaveDuplicates(){
        int[] input = new int[]{1,2,3,4,5,6,7,4,5};
        assertTrue(findDuplicatesInArray.run(input));
    }
}
