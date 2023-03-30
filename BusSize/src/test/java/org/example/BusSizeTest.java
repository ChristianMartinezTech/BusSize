package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class BusSizeTest extends BusSize {
    @Test
    public void shouldReturnHelloThere() {
        Integer[] groups = {1,2,1,1,1,2,1,3}; // Initializing groups
        Integer[] response = findChairSize(groups); // Sending groups into findChairSize method
        Assert.assertEquals(new Integer[]{3, 4, 6, 12}, response);
    }
}
