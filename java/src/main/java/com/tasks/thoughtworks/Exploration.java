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
        List<String> movement = commandsStrings.subList(1, commandsStrings.size()).stream().filter(i -> commandsStrings.indexOf(i) % 2 == 0).collect(toList());
        List<Rover> rovers = commandsStrings.subList(1, commandsStrings.size()).stream().filter(i -> commandsStrings.indexOf(i) % 2 != 0).map(initialPostion -> new Rover(initialPostion)).collect(toList());

        if (movement.size() == rovers.size()) {
            for (Rover rover : rovers) {
                rover.move(movement.get(rovers.indexOf(rover)));
            }
        }
        explorationElements.add(rovers);
        return this.explorationElements;
    }
}
