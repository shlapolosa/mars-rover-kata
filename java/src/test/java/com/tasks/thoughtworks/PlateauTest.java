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
}
