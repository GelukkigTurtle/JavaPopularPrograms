package com.javapopularprograms.interview;

import com.javapopularprograms.interview.arrays.EqualityOfTwoArrays;
import com.javapopularprograms.interview.arrays.Find2ndLargestNumber;
import com.javapopularprograms.interview.arrays.FindDuplicatesInArray;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by freddy.
 * Date: 04-26-20
 */
@SpringBootTest
class ArraysTests {

    Logger log = LoggerFactory.getLogger(ArraysTests.class);

    @Autowired
    EqualityOfTwoArrays equalityOfTwoArrays;


    @Autowired
    FindDuplicatesInArray findDuplicatesInArray;

    @Autowired
    Find2ndLargestNumber find2ndLargestNumber;



    //5) How do you check the equality of two arrays in java?
    @Test
    void equalityOt2Arrays(){

        int[] array1 = new int[]{1,2,3,4};
        int[] array2 = new int[]{1,2,3,4};

        boolean result = equalityOfTwoArrays.run(array1,array2);
        assertTrue(result);
    }

    // 8) How to find duplicate elements in an array?
    @Test
    void checkIfHaveDuplicates(){
        int[] input = new int[]{1,2,3,4,5,6,7,4,5};
        assertTrue(findDuplicatesInArray.run(input));
    }


    //10) How to find second largest number in an integer array?
    @Test
    void findSecondLargest(){
        int[] input = new int[]{45, 51, 28, 75, 49, 42};
        int result = find2ndLargestNumber.run(input);
        assertEquals(51,result);


    }

}
