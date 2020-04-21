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

        if ("M".equalsIgnoreCase(movementCommands) && this.position.orientation.equalsIgnoreCase("N")) {
            this.position.y++;
        }
    }
}
