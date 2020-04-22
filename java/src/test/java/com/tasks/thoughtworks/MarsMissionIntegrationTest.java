package com.tasks.thoughtworks;

import org.junit.Test;

public class MarsMissionIntegrationTest {

    @Test
    public void should_read_from_the_sample_file() {
        String[] args =  {"SampleInput.txt"};
        MarsMission.main(args);
    }

    @Test
    public void should_throw_an_exception_if_file_is_not_found() {
        String[] args =  {"nonExixtentFile.txt"};
        MarsMission.main(args);
    }
}