package com.stackroute.pe5;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class NumberOfCountsInTheStringTest {
    NumberOfCountsInTheString numberOfCountsInTheStringTest;

    @Before
    public void setup() {
        numberOfCountsInTheStringTest = new NumberOfCountsInTheString();
    }

    @Test
    public void UpdateArrayElementWithother() {
        String input = "one one -one___two,,three,one @three*one?two";
        HashMap<String, Integer> result = numberOfCountsInTheStringTest.countTheGivenString(input);
        HashMap<String, Integer> output = new HashMap<String, Integer>();
        output.put("one",5);
        output.put("two",2);
        output.put("three",2);

        assertEquals(output, result);

    }

}

