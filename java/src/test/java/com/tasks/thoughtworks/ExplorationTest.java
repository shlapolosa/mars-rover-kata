package com.tasks.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;


public class ExplorationTest {

    @Test
    public void should_return_no_updated_positions_if_an_empty_input_is_given() {
        Stream<String> stream = Stream.of("");
        Exploration exploration = new Exploration(stream);
        Assert.assertEquals("",exploration.start());
    }

    @Test
    public void should_read_and_return_the_dimensions_of_the_plateu_if_thats_all_thats_supplied() {
        Stream<String> stream = Stream.of("5 5");
        Exploration exploration = new Exploration(stream);
        Assert.assertEquals("5 5",exploration.start());
    }

    @Test
    public void should_create_a_plateau_if_the_input_is_not_empty() {
        Stream<String> stream = Stream.of("5 5");
        Exploration exploration = new Exploration(stream);
        exploration.start();
        Assert.assertNotNull(exploration.getPlateau());
    }

//    @Test
//    public void should_create_a_plateau_of_the_same_dimensions_as_the_input() {
//        Stream<String> stream = Stream.of("5 5");
//        Exploration exploration = new Exploration(stream);
//        exploration.start();
//        Assert.assertEquals(5, exploration.getPlateau().getLength());
//        Assert.assertEquals(5, exploration.getPlateau().getWidth());
//    }
}
