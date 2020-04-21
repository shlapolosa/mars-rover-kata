package com.tasks.thoughtworks;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class MarsRoverApplicationIntegrationTest {

    @Test
    public void should_read_from_the_sample_file() {
        String[] args =  {"SampleInput.txt"};
        MarsRoverApplication.main(args);
    }

    @Test
    public void should_throw_an_exception_if_file_is_not_found() {
        String[] args =  {"nonExixtentFile.txt"};
        MarsRoverApplication.main(args);
    }
}