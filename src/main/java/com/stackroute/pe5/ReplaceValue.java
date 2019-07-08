package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class ReplaceValue {
    public String replaceTheGivenValue(Map<String,String> giveninput)
    {
        if(giveninput==null)
        {
            return null;
       }
        String temp=giveninput.get("val1");
        giveninput.put("val2",temp);
        giveninput.put("val1"," ");
        return giveninput.toString();
             }

}
