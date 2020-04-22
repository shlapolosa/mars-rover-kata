package com.tasks.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

public class RoverTest {

    @Test
    public void should_create_a_rover_based_on_initial_position() {
        Rover rover = new Rover("1 2 N");
        Assert.assertNotNull(rover);
    }

    @Test
    public void should_accept_multiple_movements_for_on_certain_plateau() {
        Rover rover = new Rover("0 0 N");
        Plateau plateau = new Plateau("5 5");
        rover.execute("LL",plateau);
        Assert.assertEquals("0 0 S", rover.getFinalPosition());
    }

    @Test
    public void should_not_exceed_the_bounds_of_the_plateau() {
        Rover rover = new Rover("4 4 N");
        Plateau plateau = new Plateau("5 5");
        rover.execute("MMRMM",plateau);
        Assert.assertEquals("5 5 E", rover.getFinalPosition());
    }
}
