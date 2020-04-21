package com.tasks.thoughtworks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MarsRoverApplication {

    public static void main(String[] args) {

        Exploration exploration = null;
        try (Stream<String> lines = Files.lines(Paths.get(args[0]))) {
            exploration = new Exploration(lines);
            List<Object> explorationElements = exploration.start();
            String output = ((List<Rover>)explorationElements.get(1)).stream().map(o -> ((Rover)o).getFinalPosition()).collect(Collectors.joining(System.lineSeparator()));
            System.out.println(output);
        } catch (IOException e) {
            String handleError = e.getLocalizedMessage();
        }
    }
}
