package com.javapopularprograms.interview.arrays;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by freddy.
 * Date: 05-01-20
 */
@Component
public class PairElementsSumGivenNum {

    public void run(int[] array, int inputNumber){

        int sum = array[0];

        int start = 0;

        for(int i = 1; i < array.length; i++){
            sum = sum + array[i];

            //If sum is greater than inputNumber then following loop is executed until
            //sum becomes either smaller than or equal to inputNumber
            while(sum > inputNumber && start <= i-1){
                sum = sum - array[start];

                start++;

            }

            if(sum == inputNumber){

                System.out.println("Continuous sub array of "+ Arrays.toString(array)+" whose sum is "+inputNumber+" is ");
                for(int j = start; j <= i; j++){
                    System.out.print(array[j]+" ");
                }
                System.out.println();

            }

        }

    }

}
