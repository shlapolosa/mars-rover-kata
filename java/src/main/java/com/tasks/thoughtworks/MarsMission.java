package com.tasks.thoughtworks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MarsMission {

    public static void main(String[] args) {

        try (Stream<String> lines = Files.lines(Paths.get(args[0]))) {
            Expedition expedition = new Expedition(lines);
            ExplorationElements explorationElements = expedition.start();
            String output = explorationElements.getRovers().stream().map(o -> ((Rover)o).getFinalPosition()).collect(Collectors.joining(System.lineSeparator()));
            System.out.println(output);
        } catch (IOException e) {
            String handleError = e.getLocalizedMessage();
        }
    }
}
