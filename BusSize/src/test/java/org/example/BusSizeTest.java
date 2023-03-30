package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class BusSizeTest extends BusSize {
    @Test
    public void testOutputOne() {
        Integer[] groups = {1,2,1,1,1,2,1,3}; // Initializing groups
        Integer[] response = findChairSize(groups); // Sending groups into findChairSize method
        Assert.assertEquals(new Integer[]{3, 4, 6, 12}, response);
    }

    @Test
    public void testOutputTwo() {
        Integer[] groups = {1,2,1,1,1}; // Initializing groups
        Integer[] response = findChairSize(groups); // Sending groups into findChairSize method
        Assert.assertEquals(new Integer[]{3, 6}, response);
    }

    @Test
    public void testOutputThree() {
        Integer[] groups = {1,1,2,1,1}; // Initializing groups
        Integer[] response = findChairSize(groups); // Sending groups into findChairSize method
        Assert.assertEquals(new Integer[]{2, 6}, response);
    }

    @Test
    public void testOutputFour() {
        Integer[] groups = {1,2,2,1,3}; // Initializing groups
        Integer[] response = findChairSize(groups); // Sending groups into findChairSize method
        Assert.assertEquals(new Integer[]{3, 9}, response);
    }

    @Test
    public void testOutputFive() {
        Integer[] groups = {1,2,3,1,1,1,2,1}; // Initializing groups
        Integer[] response = findChairSize(groups); // Sending groups into findChairSize method
        Assert.assertEquals(new Integer[]{3, 6, 12}, response);
    }

    @Test
    public void testOutputSix() {
        Integer[] groups = {1,2,1,3,1,1,1,2,1,3,4}; // Initializing groups
        Integer[] response = findChairSize(groups); // Sending groups into findChairSize method
        Assert.assertEquals(new Integer[]{4, 10, 20}, response);
    }
}
