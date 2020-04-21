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

            if ("M".equalsIgnoreCase(command) && this.position.orientation.equalsIgnoreCase("N")) {
                this.position.y++;
            } else if ("M".equalsIgnoreCase(command) && this.position.orientation.equalsIgnoreCase("E")) {
                this.position.x++;
            } else if ("M".equalsIgnoreCase(command) && this.position.orientation.equalsIgnoreCase("W")) {
                this.position.x--;
            } else if ("M".equalsIgnoreCase(command) && this.position.orientation.equalsIgnoreCase("S")) {
                this.position.y--;
            }

            if ("R".equalsIgnoreCase(command)) {
                this.position.orientation = Compass.swingClockWise(this.position.orientation);
            } else if ("L".equalsIgnoreCase(command)) {
                this.position.orientation = Compass.swingAntiClockWise(this.position.orientation);
            }
        }
    }
}
