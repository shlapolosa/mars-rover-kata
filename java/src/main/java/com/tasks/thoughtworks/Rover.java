package com.tasks.thoughtworks;

public class Rover {

    private RoverPosition position;

    public Rover(String initialPosition) {
        this.position = new RoverPosition(initialPosition);
    }

    public String getFinalPosition() {

        return this.position.toString();
    }

    public void move(String movementCommands) {

        for (int i = 0; i < movementCommands.length(); i++) {
            String command = String.valueOf(movementCommands.charAt(i));
            this.position.update(command);
        }
    }
}
