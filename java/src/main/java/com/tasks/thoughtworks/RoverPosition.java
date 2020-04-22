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
        return x + " " + y + " " + orientation;
    }

    public void update(String aMovement, Plateau forThisPlateau) {

        if ("M".equalsIgnoreCase(aMovement) && this.orientation.equalsIgnoreCase("N")) {
            if (this.y + 1 <= forThisPlateau.getLength())this.y = ++this.y;
        } else if ("M".equalsIgnoreCase(aMovement) && this.orientation.equalsIgnoreCase("E")) {
            if (this.x + 1 <= forThisPlateau.getWidth())this.x = ++this.x;
        } else if ("M".equalsIgnoreCase(aMovement) && this.orientation.equalsIgnoreCase("W")) {
            if (this.x - 1 >= 0)this.x = --this.x;
        } else if ("M".equalsIgnoreCase(aMovement) && this.orientation.equalsIgnoreCase("S")) {
            if (this.y - 1 >= 0)this.y = --this.y;
        }

        if ("R".equalsIgnoreCase(aMovement)) {
            this.orientation = Compass.swingClockWise(this.orientation);
        } else if ("L".equalsIgnoreCase(aMovement)) {
            this.orientation = Compass.swingAntiClockWise(this.orientation);
        }
    }
}
