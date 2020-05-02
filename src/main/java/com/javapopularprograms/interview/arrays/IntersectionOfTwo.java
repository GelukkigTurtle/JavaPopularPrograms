package com.javapopularprograms.interview.arrays;

import org.springframework.stereotype.Component;

import java.util.HashSet;

/**
 * Created by freddy.
 * Date: 05-01-20
 */
@Component
public class IntersectionOfTwo {

    public void run(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr1.length; i++){
            for(int j=0; j < arr2.length; j++){

                if(arr1[i] == arr2[j])
                    set.add(arr1[i]);
            }
        }

        for( Integer num: set){
            System.out.println(num);
        }

    }

}
