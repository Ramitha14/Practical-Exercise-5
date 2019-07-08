package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class NumberOfCountsInTheString {
    public HashMap<String,Integer> countTheGivenString(String str) {
        // String str="one one -one___two,,three,one @three*one?two";
        String[] array = str.split("[\\W_\\s]+");
        HashMap<String, Integer> map = new HashMap<>();
        for (String result : array) {
            if (map.containsKey(result))
            {
                map.put(result, map.get(result) + 1);
            } else
                {
                map.put(result, 1);
            }
        }
        for (Map.Entry entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " ");
        }
       return map;
    }
}