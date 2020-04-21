package com.tasks.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompassTest {
    @Test
    public void should_have_the_four_cardinal_points() {
        Assert.assertTrue(Compass.contains("N"));
        Assert.assertTrue(Compass.contains("E"));
        Assert.assertTrue(Compass.contains("S"));
        Assert.assertTrue(Compass.contains("W"));

    }

    @Test
    public void should_rotate_clockwise_when_input_is_right() {
        Assert.assertEquals("E",Compass.swingClockWise("N"));
        Assert.assertEquals("S",Compass.swingClockWise("E"));
        Assert.assertEquals("W",Compass.swingClockWise("S"));
        Assert.assertEquals("N",Compass.swingClockWise("W"));
    }

    @Test
    public void should_rotate_anticlockwise_when_input_is_left() {
        Assert.assertEquals("W",Compass.swingAntiClockWise("N"));
        Assert.assertEquals("S",Compass.swingAntiClockWise("W"));
        Assert.assertEquals("E",Compass.swingAntiClockWise("S"));
        Assert.assertEquals("N",Compass.swingAntiClockWise("E"));
    }
}