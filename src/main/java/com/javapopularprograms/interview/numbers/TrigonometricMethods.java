package com.javapopularprograms.interview.numbers;

import org.springframework.stereotype.Component;

/**
 * Created by freddy.
 * Date: 05-01-20
 */

@Component
public class TrigonometricMethods {

    public void run(double angle){

        //converting angle to radians.
        double angleInRadians = Math.toRadians(angle);

        double sineOfNum = Math.sin(angleInRadians);
        double cosineOfNum = Math.cos(angleInRadians);
        double tangentOfNum = Math.tan(angleInRadians);

        double secOfNum = (1 / sineOfNum);
        double cosecOfNum = (1 / cosineOfNum);
        double cotOfNum = (1 / tangentOfNum);

        System.out.println("sin("+angle+") = "+sineOfNum);
        System.out.println("cos("+angle+") = "+cosineOfNum);
        System.out.println("tan("+angle+") = "+tangentOfNum);

        System.out.println("--------------------------------");

        System.out.println("sec("+angle+") = "+secOfNum);
        System.out.println("cosec("+angle+") = "+cosecOfNum);
        System.out.println("cot("+angle+") = "+cotOfNum);

    }
}
