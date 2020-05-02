package com.javapopularprograms.interview.arrays;

import org.springframework.stereotype.Component;

/**
 * Created by freddy.
 * Date: 05-01-20
 */

@Component
public class FindMissingNumber {

    public int run(int[] array,int n){
        int sumOfNnumbers = (n * (n+1))/ 2;
        int sumOfElements = 0;

        for(int i=0; i <array.length;i++){
            sumOfElements = sumOfElements  + array[i];
        }


        System.out.println("sumOfElements "+sumOfElements);
        System.out.println("sumOfNnumbers "+sumOfNnumbers);

        int missingNumber = sumOfNnumbers - sumOfElements;

        System.out.println("missing number "+missingNumber+ " = sumOfNnumbers - sumOfElements");

        return missingNumber;
    }
}
