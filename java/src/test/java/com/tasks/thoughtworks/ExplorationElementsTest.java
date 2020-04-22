package com.tasks.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ExplorationElementsTest {
    @Test
    public void should_have_a_plateau() {
        ExplorationElements explorationElements = new ExplorationElements();
        Plateau plateau = new Plateau("1 1 N");
        explorationElements.setPlateau(plateau);
        Assert.assertEquals(plateau, explorationElements.getPlateau());

    }

    @Test
    public void should_have_rovers() {
        ExplorationElements explorationElements = new ExplorationElements();
        ArrayList<Rover> rovers = new ArrayList<>();
        explorationElements.setRovers(rovers);
        Assert.assertNotNull(explorationElements.getRovers());
    }
}
