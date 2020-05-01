package com.javapopularprograms.interview.strings;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by freddy.
 * Date: 05-01-20
 */

@Component
public class CountCharacterOccurrences {


    public void run(String input){

        Map<Character,Integer> map = new HashMap<>();

        char[] characters = input.toCharArray();

        for( char c : characters){

            if(map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            }else{
                map.put(c, 1);
            }
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+ " - "+ entry.getValue());
        }

    }

}
