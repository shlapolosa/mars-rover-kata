package com.tasks.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.instanceOf;


public class ExplorationTest {

    @Test
    public void should_return_no_updated_positions_if_an_empty_input_is_given() {
        Stream<String> stream = Stream.of("");
        Exploration exploration = new Exploration(stream);
        Assert.assertTrue(exploration.start().isEmpty());
    }

    @Test
    public void should_read_and_return_the_dimensions_of_the_plateu_if_thats_all_thats_supplied() {
        Stream<String> stream = Stream.of("5 5");
        Exploration exploration = new Exploration(stream);
        Assert.assertEquals("5 5",exploration.start().get(0).toString());
    }

    @Test
    public void should_create_a_plateau_if_the_input_is_not_empty() {
        Stream<String> stream = Stream.of("3 3");
        Exploration exploration = new Exploration(stream);
        Assert.assertEquals("3 3", exploration.start().get(0).toString());
    }

    @Test
    public void should_create_a_plateau_of_the_same_dimensions_as_the_input() {
        Stream<String> stream = Stream.of("5 5");
        Exploration exploration = new Exploration(stream);
        List<Object> objectList = exploration.start();
        Assert.assertThat(objectList.get(0), instanceOf(Plateau.class));
    }

    @Test
    public void should_create_a_list_of_rovers() {
        Stream<String> stream = Stream.of("5 5","1 2 N", "LML");
        Exploration exploration = new Exploration(stream);
        List<Object> objectList = exploration.start();
        Assert.assertThat(objectList.get(1),instanceOf(List.class));
        Assert.assertThat(((List<Rover>)objectList.get(1)).get(0),instanceOf(Rover.class));
    }

    
}
