package com.tasks.thoughtworks;

public class Plateau {

    private final int length;
    private final int width;

    public Plateau(String dimensions) {
        this.length = Integer.parseInt(dimensions.substring(0,1));
        this.width = Integer.parseInt(dimensions.substring(2,3));
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
