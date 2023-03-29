package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BusSizeTest extends BusSize {
    @Test
    public void shouldReturnHelloThere() {
        String hi = helloThere();
        Assert.assertEquals("Hello There!", hi);
    }
}
