package com.tasks.thoughtworks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MarsRoverApplication {

    public static void main(String[] args) {
        String content = "";
        try (Stream<String> lines = Files.lines(Paths.get(args[0]))) {
            content = lines.collect(Collectors.joining(System.lineSeparator()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(content);
    }
}
