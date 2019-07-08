package com.stackroute.pe5;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountTheStringTest {

    CountTheString countTheString;

        @Before
        public void setup() {
            countTheString = new CountTheString();
        }

        @Test
        public void UpdateArrayElementWithOther() {
            String input[] = {"a","b","c","d","a","c","c"};
            HashMap<String, Boolean> result = countTheString.countTheGivenString(input);
            HashMap<String, Boolean> output = new HashMap<String, Boolean>();
            output.put("a", true);
            output.put("b", false);
            output.put("c", true);
            output.put("d", false);
            assertEquals(output, result);

        }

    }




