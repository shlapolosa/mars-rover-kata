package com.tasks.thoughtworks;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Exploration {

    private Stream<String> inputCommands;
    private Plateau plateau;

    public Exploration(Stream<String> inputCommands) {
        this.inputCommands = inputCommands;
    }

    public String start() {
        List<String> commandsStrings = inputCommands.collect(toList());
        if(commandsStrings.get(0).isEmpty()){
            return "";
        }
        List<Plateau> plateauList = Stream.of(commandsStrings.get(0)).map(plateau -> new Plateau(plateau)).collect(toList());
        List<String> StringList = commandsStrings.subList(1, commandsStrings.size());
        this.plateau = plateauList.get(0);
        return this.plateau.toString();
    }

    public Plateau getPlateau() {
        return plateau;
    }
}
