package app.bussize;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.naming.Context;

public class BusSizeTest extends BusSize {
    @Test
    public void testOutputOne() {
        String groups = "1,2,1,1,1,2,1,3"; // Initializing groups
        String response = findChairSize(groups); // Sending groups into findChairSize method
        Assert.assertEquals("3,4,6,12", response);
    }

    @Test
    public void testOutputTwo() {
        String groups = "1,2,1,1,1"; // Initializing groups
        String response = findChairSize(groups); // Sending groups into findChairSize method
        Assert.assertEquals("3,6", response);
    }

    @Test
    public void testOutputThree() {
        String groups = "1,1,2,1,1"; // Initializing groups
        String response = findChairSize(groups); // Sending groups into findChairSize method
        Assert.assertEquals("2,6", response);
    }

    @Test
    public void testOutputFour() {
        String groups = "1,2,2,1,3"; // Initializing groups
        String response = findChairSize(groups); // Sending groups into findChairSize method
        Assert.assertEquals("3,9", response);
    }

    @Test
    public void testOutputFive() {
        String groups = "1,2,3,1,1,1,2,1"; // Initializing groups
        String response = findChairSize(groups); // Sending groups into findChairSize method
        Assert.assertEquals("3,6,12", response);
    }

    @Test
    public void testOutputSix() {
        String groups = "1,2,1,3,1,1,1,2,1,3,4"; // Initializing groups
        String response = findChairSize(groups); // Sending groups into findChairSize method
        Assert.assertEquals("4,10,20", response);
    }
}
