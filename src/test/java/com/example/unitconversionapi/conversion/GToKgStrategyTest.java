package com.example.unitconversionapi.conversion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.server.ResponseStatusException;

import static org.junit.jupiter.api.Assertions.*;

class GToKgStrategyTest {

    GToKgStrategy gToKgStrategy;

    @BeforeEach
    void setup() {
        gToKgStrategy = new GToKgStrategy();
    }

    @Test
    void convert1000gTo1kg() {
        assertEquals(1f, gToKgStrategy.convert(1000));
    }

    @Test
    void convert200000gTo200kg() {
        assertEquals(200f, gToKgStrategy.convert(200000));
    }

    @Test
    void throwExceptionOnNegativeInput() {
        assertThrows(ResponseStatusException.class, ()->gToKgStrategy.convert(-200));
    }

    @Test
    void throwExceptionOnInputIsZero() {
        assertThrows(ResponseStatusException.class, ()->gToKgStrategy.convert(0));
    }
}