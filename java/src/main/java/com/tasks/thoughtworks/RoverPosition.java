package com.tasks.thoughtworks;

public class RoverPosition {
    public int x;
    public int y;
    public String orientation;

    public RoverPosition(String initialPosition) {
        this.x = Integer.parseInt(initialPosition.substring(0, 1));
        this.y = Integer.parseInt(initialPosition.substring(2, 3));
        this.orientation = initialPosition.substring(4, 5);
    }

    @Override
    public String toString() {
        return x +" " + y +" " + orientation;
    }

    public void update(String command) {
        if ("M".equalsIgnoreCase(command) && this.orientation.equalsIgnoreCase("N")) {
            this.y++;
        } else if ("M".equalsIgnoreCase(command) && this.orientation.equalsIgnoreCase("E")) {
            this.x++;
        } else if ("M".equalsIgnoreCase(command) && this.orientation.equalsIgnoreCase("W")) {
            this.x--;
        } else if ("M".equalsIgnoreCase(command) && this.orientation.equalsIgnoreCase("S")) {
            this.y--;
        }

        if ("R".equalsIgnoreCase(command)) {
            this.orientation = Compass.swingClockWise(this.orientation);
        } else if ("L".equalsIgnoreCase(command)) {
            this.orientation = Compass.swingAntiClockWise(this.orientation);
        }
    }
}
