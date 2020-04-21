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
    public void should_move_the_rover_up_if_its_facing_North() {
        Rover rover = new Rover("0 0 N");
        rover.move("M");
        Assert.assertEquals("0 1 N", rover.getFinalPosition());
        rover.move("M");
        Assert.assertEquals("0 2 N", rover.getFinalPosition());
    }

    @Test
    public void should_move_the_rover_right_if_its_facing_East() {
        Rover rover = new Rover("0 0 E");
        rover.move("M");
        Assert.assertEquals("1 0 E", rover.getFinalPosition());
    }

    @Test
    public void should_mobe_the_rover_left_if_its_facing_West() {
        Rover rover = new Rover("1 1 W");
        rover.move("M");
        Assert.assertEquals("0 1 W", rover.getFinalPosition());
    }

    @Test
    public void should_mobe_the_rover_down_if_its_facing_South() {
        Rover rover = new Rover("1 1 S");
        rover.move("M");
        Assert.assertEquals("1 0 S", rover.getFinalPosition());
    }

    @Test
    public void should_change_orientation_clockwise_of_a_compass_if_input_is_right() {
        Rover rover = new Rover("0 0 N");
        rover.move("R");
        Assert.assertEquals("0 0 E", rover.getFinalPosition());
    }

    @Test
    public void should_change_orientation_anti_clockwise_of_a_compass_if_input_is_left() {
        Rover rover = new Rover("0 0 N");
        rover.move("L");
        Assert.assertEquals("0 0 W", rover.getFinalPosition());
    }

    @Test
    public void should_accept_multiple_movements() {
        Rover rover = new Rover("0 0 N");
        rover.move("LL");
        Assert.assertEquals("0 0 S", rover.getFinalPosition());
    }
}
