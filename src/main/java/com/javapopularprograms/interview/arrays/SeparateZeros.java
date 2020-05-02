package com.javapopularprograms.interview.arrays;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by freddy.
 * Date: 05-01-20
 */
@Component
public class SeparateZeros {

    public void run(int[] array){

        System.out.println("Original");
        System.out.println(Arrays.toString(array));

        int[] toEnd = new int[array.length];
        int[] toBegin = new int[array.length];

        int counter = 0;

        //moving to end
        for(int i=0;i< array.length; i++){
            if(array[i]!= 0){
                toEnd[counter] = array[i];
                counter++;
            }
        }

        //assigning zero to remain
        while(counter < array.length){
            toEnd[counter] = 0;
            counter++;
        }
        System.out.println("To End");
        System.out.println(Arrays.toString(toEnd));

        //moving to begining
        counter  = array.length -1;
        for(int j=0; j < array.length; j++){
            if(array[j] != 0){
                toBegin[counter] = array[j];
                counter--;
            }
        }

        while(counter >= 0){
            toBegin[counter] = 0;
            counter--;
        }

        System.out.println("To Begin");
        System.out.println(Arrays.toString(toBegin));

    }

}
