package com.tasks.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class Compass {

    static final List<String> cardinalPoints = new ArrayList<String>() {{
        add("N");
        add("E");
        add("S");
        add("W");
    }};

    public static boolean contains(String orientation) {
        return cardinalPoints.contains(orientation);
    }


    public static String swingClockWise(String fromOrientation) {

        int indexOf = cardinalPoints.indexOf(fromOrientation);
        int nextCardinal = indexOf + 1;
        int cardinal = nextCardinal % 4;
        String response = cardinalPoints.get(cardinal);
        return response;
    }


    public static String swingAntiClockWise(String fromOrientation) {
        int indexOf = cardinalPoints.indexOf(fromOrientation);
        int nextCardinal = indexOf - 1;
        int cardinal = (cardinalPoints.size() + nextCardinal) % 4;
        String response = cardinalPoints.get(cardinal);
        return response;
    }

}
