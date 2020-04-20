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
}
