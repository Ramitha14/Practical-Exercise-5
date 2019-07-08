package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class CountTheString {
    public HashMap<String,Boolean> countTheGivenString(String str[]) {
        HashMap<String, Boolean> map = new HashMap<>();
        for (String result : str) {
            if (map.containsKey(result)) {
                map.put(result, true);
            } else {
                map.put(result, false);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " ");
        }
        return map;
    }

}