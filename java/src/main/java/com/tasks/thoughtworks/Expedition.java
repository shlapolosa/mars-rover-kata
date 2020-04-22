package com.tasks.thoughtworks;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Expedition {

    private Stream<String> inputCommands;
    private List<Object> explorationElements = new ArrayList<Object>();

    public Expedition(Stream<String> inputCommands) {
        this.inputCommands = inputCommands;
    }

    public List<Object> start() {

        List<String> commandsStrings = inputCommands.collect(toList());
        if (commandsStrings.get(0).isEmpty()) {
            return this.explorationElements;
        }

        createPlateau(commandsStrings);

        extractMovementCommands(commandsStrings);

        getRovers(commandsStrings);

        moveRovers();

        return this.explorationElements;
    }

    private void moveRovers() {

        List<String> movement = (List<String>)explorationElements.get(1);
        List<Rover> rovers = (List<Rover>)explorationElements.get(2);
        if (movement.size() == rovers.size()) {
            for (Rover rover : rovers) {
                rover.move(movement.get(rovers.indexOf(rover)));
            }
        }
    }

    private void getRovers(List<String> commandsStrings) {
        List<Rover> rovers = commandsStrings.subList(1, commandsStrings.size()).stream().filter(i -> commandsStrings.indexOf(i) % 2 != 0).map(initialPostion -> new Rover(initialPostion)).collect(toList());
        explorationElements.add(rovers);
    }

    private void extractMovementCommands(List<String> commandsStrings) {
        List<String> movement= commandsStrings.subList(1, commandsStrings.size()).stream().filter(i -> commandsStrings.indexOf(i) % 2 == 0).collect(toList());
        explorationElements.add(movement);
    }

    private void createPlateau(List<String> commandsStrings) {
        Plateau aplateau = Stream.of(commandsStrings.get(0)).map(plateau -> new Plateau(plateau)).collect(toList()).get(0);
        explorationElements.add(aplateau);
    }
}
