package com.example.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void addFunctionShouldReturnCorrectAnswer() {
        int actual = Main.add(1,2);
        int expected = 3;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void addFunctionShouldReturnCorrectAnswer2() {
        int actual = Main.add(1,2);
        int expected = 3;

        Assertions.assertEquals(actual, expected);
    }
}
