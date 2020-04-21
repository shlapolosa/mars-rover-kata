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
}
