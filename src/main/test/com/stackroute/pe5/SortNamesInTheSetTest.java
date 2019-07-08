package com.stackroute.pe5;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import static org.junit.Assert.*;


public class SortNamesInTheSetTest {
    SortNamesInTheSet sortNamesInTheSet;
    @Before
    public void setup() {
        sortNamesInTheSet = new SortNamesInTheSet();
    }

    @Test
    public void UpdateArrayElementWithother() {
        String input[] = {"Harry","Olive","Alice","Bluto","Eugene"};
        List<String> result = sortNamesInTheSet.sortTheGivenNames(input);
        List<String> output = new ArrayList<>();
        output.add("Alice");
        output.add("Bluto");
        output.add("Eugene");
        output.add("Harry");
        output.add("Olive");
        assertEquals(output, result);

    }

}