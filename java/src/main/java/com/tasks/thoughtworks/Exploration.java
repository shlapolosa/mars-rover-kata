package com.tasks.thoughtworks;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exploration {

    private Stream<String> inputCommands;

    public Exploration(Stream<String> inputCommands) {
        this.inputCommands = inputCommands;
    }

    public String start() {
        return inputCommands.collect(Collectors.joining(System.lineSeparator()));
    }

    public Object getPlateau() {
        return "null";
    }
}
