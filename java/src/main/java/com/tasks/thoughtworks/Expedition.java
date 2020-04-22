package com.tasks.thoughtworks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Expedition {

    private List<String> commandsStrings;

    public Expedition(Stream<String> inputCommands) {
        this.commandsStrings = inputCommands.collect(toList());
    }

    public ExplorationElements start() {

        if (commandsStrings.get(0).isEmpty()) {
            return new ExplorationElements();
        }

        return new ExpeditionBuilder(commandsStrings).
                createPlateau().
                getRovers().
                moveRovers().
                build();
    }


    private class ExpeditionBuilder {

        private List<String> commandsStrings;
        private ExplorationElements explorationElements = new ExplorationElements();

        public ExpeditionBuilder(List<String> inputCommands) {
            this.commandsStrings = inputCommands;
        }

        public ExpeditionBuilder moveRovers() {

            List<String> movement = commandsStrings.subList(1, commandsStrings.size()).stream().filter(i -> commandsStrings.indexOf(i) % 2 == 0).collect(toList());
            List<Rover> rovers = explorationElements.getRovers();
            if (movement.size() == rovers.size()) {
                for (Rover rover : rovers) {
                    rover.move(movement.get(rovers.indexOf(rover)));
                }
            }
            return this;
        }

        public ExpeditionBuilder getRovers() {
            List<Rover> rovers = commandsStrings.subList(1, commandsStrings.size()).stream().filter(i -> commandsStrings.indexOf(i) % 2 != 0).map(initialPostion -> new Rover(initialPostion)).collect(toList());
            explorationElements.setRovers(rovers);
            return this;
        }

        public ExpeditionBuilder createPlateau() {
            Plateau aplateau = Stream.of(commandsStrings.get(0)).map(plateau -> new Plateau(plateau)).collect(toList()).get(0);
            explorationElements.setPlateau(aplateau);
            return this;
        }

        public ExplorationElements build() {
            return explorationElements;
        }
    }

}
