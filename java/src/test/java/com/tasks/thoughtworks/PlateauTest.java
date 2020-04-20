package com.tasks.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

public class PlateauTest {

    @Test
    public void should_have_a_length_and_a_width() {
        Plateau plateau = new Plateau("5 5");
        Assert.assertEquals(5, plateau.getLength());
        Assert.assertEquals(5, plateau.getWidth());
    }

    @Test
    public void should_change_the_dimensions_based_on_input() {
        Plateau plateau = new Plateau("3 3");
        Assert.assertEquals(3, plateau.getLength());
        Assert.assertEquals(3, plateau.getWidth());
    }
}
