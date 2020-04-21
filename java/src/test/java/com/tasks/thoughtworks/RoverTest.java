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
    public void should_be_in_the_same_position_if_no_movement_commands_are_given() {
        Rover rover = new Rover("1 2 N");
        rover.move("");
        Assert.assertEquals("1 2 N", rover.getFinalPosition());
    }

    @Test
    public void should_move_when_movement_commands_are_given() {
        Rover rover = new Rover("0 0 N");
        rover.move("M");
        Assert.assertEquals("0 1 N", rover.getFinalPosition());
        rover.move("M");
        Assert.assertEquals("0 2 N", rover.getFinalPosition());
    }
}
