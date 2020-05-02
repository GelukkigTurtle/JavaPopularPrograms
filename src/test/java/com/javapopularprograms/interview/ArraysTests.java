package com.javapopularprograms.interview;

import com.javapopularprograms.interview.arrays.*;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

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

    @Autowired
    PairElementsSumGivenNum pairElementsSumGivenNum;

    @Autowired
    RemovingDuplicates removingDuplicates;

    @Autowired
    IntersectionOfTwo intersectionOfTwo;

    @Autowired
    SeparateZeros separateZeros;

    @Autowired
    LeadersArray leadersArray;

    @Autowired
    FindMissingNumber findMissingNumber;




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

    //15) How to find continuous sub array whose sum is equal to given number?
    @Test
    void findSubArraySumNumber(){
        int[] input  = new int[]{42, 15, 12, 8, 6, 32};
        int sum = 26;
        pairElementsSumGivenNum.run(input,sum);
    }

    //16) How to remove duplicate elements from ArrayList in java?
    @Test
    void removeDuplicates(){
        ArrayList<String> listWithDuplicateElements = new ArrayList<String>();
        listWithDuplicateElements.add("JAVA");
        listWithDuplicateElements.add("J2EE");
        listWithDuplicateElements.add("JSP");
        listWithDuplicateElements.add("SERVLETS");
        listWithDuplicateElements.add("JAVA");
        listWithDuplicateElements.add("STRUTS");
        listWithDuplicateElements.add("JSP");

        removingDuplicates.run(listWithDuplicateElements);
    }

    //19) How to find intersection of two arrays in java?
    @Test
    void findIntersection(){
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{4,5,6,7,1};
        intersectionOfTwo.run(arr1,arr2);
    }

    //23) How to separate zeros from non-zeros in an array?
    @Test
    void separteZeros(){
        int[] array = new int[] {12, 0, 7, 0, 8, 0, 3};
        separateZeros.run(array);
    }
    //25) How to find all the leaders in an integer array in java?
    @Test
    void findLeaders(){
        int[] input = new int[]{12, 9, 7, 14, 8, 6, 3};
        leadersArray.run(input);
    }


    //32) Find missing number in an array
    @Test
    void findMissing(){
        int[] input = new int[]{1, 4, 5, 3, 7, 8, 6,2,10};
        int find = 10;
        int result = findMissingNumber.run(input,find);
        assertEquals(9, result);
    }



}
