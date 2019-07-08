package com.stackroute.pe5;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ReplaceValueTest {

        ReplaceValue replacevalue;
        @Before
        public void setup()
        {
            replacevalue =new ReplaceValue();
        }
        @Test
        public void replaceValueWithAnotherValue()
        {
            Map<String,String> input=new HashMap<String,String>();
            input.put("val1","java");
            input.put("val2","c++");
            String result= replacevalue.replaceTheGivenValue(input);
            String output="{val2=java, val1= }";
            assertEquals(result,output);

        }
        @Test
        public void replaceValueWithAnotherValueInMap()
        {
            Map<String,String> input=new HashMap<String,String>();
            input.put("val1","mars");
            input.put("val2","saturn");
            String result= replacevalue.replaceTheGivenValue(input);
            String output="{val2=mars, val1= }";
            assertEquals(result,output);

        }

    }

