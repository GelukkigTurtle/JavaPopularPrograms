package com.javapopularprograms.interview.strings;

import org.springframework.stereotype.Component;

/**
 * Created by freddy.
 * Date: 05-01-20
 */
@Component
public class ISStringRotation {

    public boolean run(String s1,String s2){

        if(s1.length() != s2.length()){
            return false;
        }else{

            String s3 = s1+ s1;
            if(!s3.contains(s2)) return false;

        }


        return true;
    }

}
