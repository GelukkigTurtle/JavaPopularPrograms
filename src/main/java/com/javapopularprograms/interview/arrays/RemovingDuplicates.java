package com.javapopularprograms.interview.arrays;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by freddy.
 * Date: 05-01-20
 */
@Component
public class RemovingDuplicates {

    public void run(ArrayList<String> input){

        System.out.print("ArrayList With Duplicate Elements :");

        System.out.println(input);

        HashSet<String> set = new HashSet<>(input);


        System.out.print("ArrayList After Removing Duplicate Elements :");

        System.out.println(set);
    }

}
