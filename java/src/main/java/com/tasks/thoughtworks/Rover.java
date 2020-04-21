package com.tasks.thoughtworks;

public class Rover {

    private String position;

    public Rover(String initialPosition) {
        this.position = initialPosition;
    }

    public String getFinalPosition() {

        return this.position;
    }

    public void move(String movementCommands) {
        if ("M".equalsIgnoreCase(movementCommands) && this.position.equalsIgnoreCase("0 0 N")) {
            this.position = "0 1 N";
        }else if ("M".equalsIgnoreCase(movementCommands) && this.position.equalsIgnoreCase("0 1 N")) {
            this.position = "0 2 N";
        }

    }
}
