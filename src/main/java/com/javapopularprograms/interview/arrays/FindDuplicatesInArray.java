package com.javapopularprograms.interview.arrays;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by freddy.
 * Date: 04-26-20
 */
@Component
public class FindDuplicatesInArray {

    public boolean run(int[] array){

        Set<Integer> set = new HashSet<Integer>();
        for(int element : array){
            if(!set.add(element)) return true;
        }
        return false;
    }
}
