package com.javapopularprograms.interview.arrays;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by freddy.
 * Date: 05-01-20
 */
@Component
public class LeadersArray {

    public void run(int[] array){
        int length = array.length;

        int max = array[length-1];
        ArrayList<Integer> leaders = new ArrayList<>();
        for(int i = array.length -2; i>= 0;i--){
            if(array[i] > max){
                leaders.add(array[i]);
                max = array[i];
            }
        }

        System.out.println("Original");
        System.out.println(Arrays.toString(array));
        System.out.println("Leaders");
        System.out.println(leaders);
    }

}
