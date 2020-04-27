package com.javapopularprograms.interview.strings;

import org.springframework.stereotype.Component;

/**
 * Created by freddy.
 * Date: 04-26-20
 */
@Component
public class NumberPyramid {

    public void run(int numberOfRows){
        int rowCount = 1;
        for(int i = numberOfRows; i > 0; i--){
            //print spaces at the beginning of a row
            for(int j =1; j <= i; j++){
                System.out.print(" ");
            }

            //printing row count value rowcount times at the end of each row.
            for(int j=1; j <= rowCount; j++){
                System.out.print(rowCount+ " ");
            }
            System.out.println();

            rowCount++;
        }
    }
}
