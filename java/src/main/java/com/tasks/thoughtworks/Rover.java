package com.tasks.thoughtworks;

public class Rover {

    private RoverPosition position;

    public Rover(String initialPosition) {
        this.position = new RoverPosition(initialPosition);
    }

    public String getFinalPosition() {

        return this.position.toString();
    }

    public void execute(String aMovement, Plateau onAPlateau) {

        for (int i = 0; i < aMovement.length(); i++) {
            String command = String.valueOf(aMovement.charAt(i));
            this.position.update(command, onAPlateau);
        }
    }
}
