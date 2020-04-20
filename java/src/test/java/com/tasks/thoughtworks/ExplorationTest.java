package com.tasks.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;


public class ExplorationTest {

    @Test
    public void should_return_no_updated_positions_if_an_empty_input_is_given() {
        Stream<String> stream = Stream.of("");
        Exploration exploration = new Exploration(stream);
        Assert.assertNull("",exploration.start());
    }
}
