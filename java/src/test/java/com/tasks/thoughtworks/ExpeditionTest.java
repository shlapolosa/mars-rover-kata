package com.tasks.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.instanceOf;


public class ExpeditionTest {

    @Test
    public void should_return_no_updated_positions_if_an_empty_input_is_given() {
        Stream<String> stream = Stream.of("");
        Expedition expedition = new Expedition(stream);
        Assert.assertNotNull(expedition.start().getPlateau());
    }

    @Test
    public void should_read_and_return_the_dimensions_of_the_plateu_if_thats_all_thats_supplied() {
        Stream<String> stream = Stream.of("5 5");
        Expedition expedition = new Expedition(stream);
        Assert.assertEquals("5 5", expedition.start().getPlateau().toString());
    }

    @Test
    public void should_create_a_plateau_if_the_input_is_not_empty() {
        Stream<String> stream = Stream.of("3 3");
        Expedition expedition = new Expedition(stream);
        Assert.assertEquals("3 3", expedition.start().getPlateau().toString());
    }

    @Test
    public void should_create_a_plateau_of_the_same_dimensions_as_the_input() {
        Stream<String> stream = Stream.of("5 5");
        Expedition expedition = new Expedition(stream);
        Assert.assertThat(expedition.start().getPlateau(), instanceOf(Plateau.class));
    }

    @Test
    public void should_create_a_list_of_rovers() {
        Stream<String> stream = Stream.of("5 5","1 2 N");
        Expedition expedition = new Expedition(stream);
        ExplorationElements objectList = expedition.start();
        Assert.assertThat(objectList.getRovers(),instanceOf(List.class));
        Assert.assertThat(objectList.getRovers().get(0),instanceOf(Rover.class));
    }

    @Test
    public void should_check_that_a_rover_is_in_its_final_position_after_it_moves() {
        Stream<String> stream = Stream.of("5 5","0 0 N", "M");
        Expedition expedition = new Expedition(stream);
        ExplorationElements objectList = expedition.start();
        Rover rover = objectList.getRovers().get(0);
        Assert.assertEquals("0 1 N", rover.getFinalPosition());

    }

    @Test
    public void should_move_more_than_one_rover_more_than_once() {
        Stream<String> stream = Stream.of("5 5","0 0 N", "MM","1 1 E", "LM");
        Expedition expedition = new Expedition(stream);
        ExplorationElements objectList = expedition.start();
        Rover rover1 = objectList.getRovers().get(0);
        Assert.assertEquals("0 2 N", rover1.getFinalPosition());
        Rover rover2 = objectList.getRovers().get(1);
        Assert.assertEquals("1 2 N", rover2.getFinalPosition());

    }
}
