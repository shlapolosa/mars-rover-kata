package com.tasks.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

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


    @Test
    public void should_be_in_the_same_position_if_no_movement_commands_are_given() {
        RoverPosition position = new RoverPosition("1 2 N");
        position.update("");
        Assert.assertEquals("1 2 N", position.toString());
    }

    @Test
    public void should_move_the_rover_up_if_its_facing_North() {
        RoverPosition position = new RoverPosition("0 0 N");
        position.update("M");
        Assert.assertEquals("0 1 N", position.toString());
        position.update("M");
        Assert.assertEquals("0 2 N", position.toString());
    }

    @Test
    public void should_move_the_rover_right_if_its_facing_East() {
        RoverPosition position = new RoverPosition("0 0 E");
        position.update("M");
        Assert.assertEquals("1 0 E", position.toString());
    }

    @Test
    public void should_move_the_rover_left_if_its_facing_West() {
        RoverPosition position = new RoverPosition("1 1 W");
        position.update("M");
        Assert.assertEquals("0 1 W", position.toString());
    }

    @Test
    public void should_mobe_the_rover_down_if_its_facing_South() {
        RoverPosition position = new RoverPosition("1 1 S");
        position.update("M");
        Assert.assertEquals("1 0 S", position.toString());
    }

    @Test
    public void should_change_orientation_clockwise_of_a_compass_if_input_is_right() {
        RoverPosition position = new RoverPosition("0 0 N");
        position.update("R");
        Assert.assertEquals("0 0 E", position.toString());
    }

    @Test
    public void should_change_orientation_anti_clockwise_of_a_compass_if_input_is_left() {
        RoverPosition position = new RoverPosition("0 0 N");
        position.update("L");
        Assert.assertEquals("0 0 W", position.toString());
    }
}