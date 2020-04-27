package com.javapopularprograms.interview.strings;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by freddy.
 * Date: 04-26-20
 */
@Component
public class FindDuplicates {

    public void run(String input){

        Map<Character,Integer> map = new HashMap<>();
        char[] characters = input.toCharArray();
        for(int i=0; i < characters.length; i++){
            if(map.containsKey(characters[i])){
                map.put(characters[i],map.get(characters[i]).intValue() +1);
            }else{
                map.put(characters[i], 1);
            }
        }

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue().intValue() >= 2)
            System.out.println(entry.getKey() +" - "+entry.getValue());
        }

    }

}
