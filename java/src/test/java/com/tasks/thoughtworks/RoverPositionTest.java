package com.tasks.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoverPositionTest {
    @Test
    public void should_be_created_with_an_initial_position() {
        RoverPosition position = new RoverPosition("0 0 N");
        Assert.assertEquals(0, position.x);
        Assert.assertEquals(0, position.y);
        Assert.assertEquals("N", position.orientation);
    }

    @Test
    public void should_print_the_rovers_final_position_as_a_string() {
        RoverPosition position = new RoverPosition("0 0 N");
        Assert.assertEquals("0 0 N", position.toString());
    }
}