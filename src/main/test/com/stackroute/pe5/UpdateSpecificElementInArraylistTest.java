package com.stackroute.pe5;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateSpecificElementInArraylistTest {
    UpdateSpecificElementInArraylist updateSpecificElementInArraylist;
    @Before
    public void setup() {
        updateSpecificElementInArraylist = new UpdateSpecificElementInArraylist();
    }

    @Test
    public void UpdateArrayElementWithother() {
        String input[] = {"Apple","Grape","Melon","Berry"};
        List<String> result = updateSpecificElementInArraylist.updateSpecificElements(input);
        List<String> output = new ArrayList<>();
        output.add("Kiwi");
        output.add("Grape");
        output.add("Mango");
        output.add("Berry");
        assertEquals(output, result);

    }

}

