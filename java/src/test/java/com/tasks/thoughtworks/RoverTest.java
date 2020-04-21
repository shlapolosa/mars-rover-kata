package com.tasks.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

public class RoverTest {
    @Test
    public void should_create_a_rover_based_on_initial_position() {
        Rover rover = new Rover("1 2 N");
        Assert.assertNotNull(rover);
    }
}
