package com.stackroute.pe5;

import java.util.*;

public class SortNamesInTheSet {
    public List<String> sortTheGivenNames(String str[])
     {
        SortedSet<String> sortednames = new TreeSet<>();
        for(String result:str)
        {
            sortednames.add(result);
        }

        List<String> list = new ArrayList<>(sortednames);
              return list;
    }
}