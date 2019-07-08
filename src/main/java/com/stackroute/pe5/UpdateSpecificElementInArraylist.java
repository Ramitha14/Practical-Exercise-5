package com.stackroute.pe5;

import java.util.*;

public class UpdateSpecificElementInArraylist {
    public List<String> updateSpecificElements(String str[]) {
        ArrayList<String> array = new ArrayList<>();
        for (String result : str) {
            array.add(result);
        }
            array.set(0, "Kiwi");
            array.set(2, "Mango");
            //array.clear();
            //System.out.println(array);

        return array;
    }
}