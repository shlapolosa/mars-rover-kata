package com.tasks.thoughtworks;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class Exploration {

    private Stream<String> inputCommands;
    private Plateau plateau;

    public Exploration(Stream<String> inputCommands) {
        this.inputCommands = inputCommands;
    }

    public String start() {
        Map<Integer, List<String>> result = inputCommands.collect(groupingBy(String::length));
        if(result.containsKey(0)){
            return "";
        }
        String plateauString = result.get(3).toString().replace("[", "").replace("]", "");
        this.plateau = new Plateau(plateauString);
        return plateauString;
    }

    public Plateau getPlateau() {
        return plateau;
    }
}
