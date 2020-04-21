package com.tasks.thoughtworks;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Exploration {

    private Stream<String> inputCommands;
    private Plateau plateau;
    private List<Object> explorationElements = new ArrayList<Object>();

    public Exploration(Stream<String> inputCommands) {
        this.inputCommands = inputCommands;
    }

    public List<Object> start() {
        List<String> commandsStrings = inputCommands.collect(toList());
        if (commandsStrings.get(0).isEmpty()) {
            return this.explorationElements;
        }
        this.plateau = Stream.of(commandsStrings.get(0)).map(plateau -> new Plateau(plateau)).collect(toList()).get(0);
        explorationElements.add(plateau);
        return this.explorationElements;
    }
}
