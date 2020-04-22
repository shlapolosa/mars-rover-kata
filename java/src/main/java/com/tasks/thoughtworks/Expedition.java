package com.tasks.thoughtworks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Expedition {

    private List<String> commandsStrings;
    private List<Object> explorationElements = new ArrayList<Object>();

    public Expedition(Stream<String> inputCommands) {
        this.commandsStrings = inputCommands.collect(toList());
    }

    public List<Object> start() {

        if (commandsStrings.get(0).isEmpty()) {
            return this.explorationElements;
        }

        return new ExpeditionBuilder(commandsStrings).
                createPlateau().
                extractMovementCommands().
                getRovers().
                moveRovers().
                build();
    }


    private class ExpeditionBuilder {

        private List<String> commandsStrings;
        private List<Object> explorationElements = new ArrayList<Object>();

        public ExpeditionBuilder(List<String> inputCommands) {
            this.commandsStrings = inputCommands;
        }

        public ExpeditionBuilder moveRovers() {

            List<String> movement = (List<String>) explorationElements.get(1);
            List<Rover> rovers = (List<Rover>) explorationElements.get(2);
            if (movement.size() == rovers.size()) {
                for (Rover rover : rovers) {
                    rover.move(movement.get(rovers.indexOf(rover)));
                }
            }
            return this;
        }

        public ExpeditionBuilder getRovers() {
            List<Rover> rovers = commandsStrings.subList(1, commandsStrings.size()).stream().filter(i -> commandsStrings.indexOf(i) % 2 != 0).map(initialPostion -> new Rover(initialPostion)).collect(toList());
            explorationElements.add(rovers);
            return this;
        }

        public ExpeditionBuilder extractMovementCommands() {
            List<String> movement = commandsStrings.subList(1, commandsStrings.size()).stream().filter(i -> commandsStrings.indexOf(i) % 2 == 0).collect(toList());
            explorationElements.add(movement);
            return this;
        }

        public ExpeditionBuilder createPlateau() {
            Plateau aplateau = Stream.of(commandsStrings.get(0)).map(plateau -> new Plateau(plateau)).collect(toList()).get(0);
            explorationElements.add(aplateau);
            return this;
        }

        public List<Object> build() {
            return explorationElements;
        }
    }

}
