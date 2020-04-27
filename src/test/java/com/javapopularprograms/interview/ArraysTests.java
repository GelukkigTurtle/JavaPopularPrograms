package com.javapopularprograms.interview;

import com.javapopularprograms.interview.arrays.EqualityOfTwoArrays;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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

    @Test
    void equalityOt2Arrays(){

        int[] array1 = new int[]{1,2,3,4};
        int[] array2 = new int[]{1,2,3,4};

        boolean result = equalityOfTwoArrays.run(array1,array2);
        assertTrue(result);
    }

}
