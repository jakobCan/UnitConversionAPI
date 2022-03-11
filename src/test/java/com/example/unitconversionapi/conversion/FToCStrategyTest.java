package com.example.unitconversionapi.conversion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FToCStrategyTest {

    FToCStrategy fToCStrategy;

    @BeforeEach
    void setup() {
        fToCStrategy = new FToCStrategy();
    }

    @Test
    void convert100FtoC(){
        assertEquals(37.77778f, fToCStrategy.convert(100));
    }


    @Test
    void roundedconvert100FtoC(){
        assertEquals(37.77778f, (fToCStrategy.convert(100)));
    }

    @Test
    void roundedconvert0FtoC(){
        assertEquals(-18f, Math.round(fToCStrategy.convert(0)));
    }

}