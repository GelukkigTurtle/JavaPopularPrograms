package com.javapopularprograms.interview.arrays;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by freddy.
 * Date: 04-26-20
 */
@Component
public class EqualityOfTwoArrays {


    public boolean run (int[] array1,int[] array2){

        return Arrays.equals(array1,array2);
    }
}
