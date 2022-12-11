package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTest {

    @Test
    @DisplayName("Find minimum value")
    void findMinimumValue() {
        assertEquals(1, ArrayOperations.findMinimumValue(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    @DisplayName("Find maximum value")
    void findMaximumValue() {
        assertEquals(5, ArrayOperations.findMaximumValue(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    @DisplayName("Find average value")
    void findAverageValue() {
        assertEquals(3, ArrayOperations.findAverageValue(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    @DisplayName("Check email is valid")
    void isValidEmail() {
        assertTrue(ArrayOperations.isValidEmail("doseyenc@gmail.com"));
    }
}