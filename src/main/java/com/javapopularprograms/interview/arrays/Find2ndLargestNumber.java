package com.javapopularprograms.interview.arrays;

import org.springframework.stereotype.Component;

/**
 * Created by freddy.
 * Date: 05-01-20
 */

@Component
public class Find2ndLargestNumber {

    public int run(int[] input){

        int firstLargest, secondLargest;

        if(input[0] > input[1]){
            firstLargest = input[0];
            secondLargest = input[1];
        }else{

            firstLargest = input[1];
            secondLargest = input[0];

        }
        //checking the rest of elements
        for(int i = 2; i < input.length; i++){

            if(input[i] > firstLargest){
                 secondLargest = firstLargest;
                 firstLargest = input[i];
            }else if(input[i] < firstLargest && input[i] > secondLargest){
                secondLargest = input[i];
            }

        }

        return secondLargest;
    }

}
