package com.example.unitconversionapi.conversion;

import com.example.unitconversionapi.controller.ConversionController;
import com.example.unitconversionapi.dto.Request;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.server.ResponseStatusException;

import  static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;


class KgToGStrategyTest {


    KgToGStrategy kgToGStrategy;

    @BeforeEach
    void setup(){
        kgToGStrategy = new KgToGStrategy();
    }


    @Test
    void convert1kgTo1000g() {
        assertEquals(1000f, kgToGStrategy.convert(1));
    }


    @Test
    void convert200gTo200000kg() {
        assertEquals(200000f, kgToGStrategy.convert(200));
    }


    @Test
    void throwExceptionOnNegativeInput() {
        assertThrows(ResponseStatusException.class, ()->kgToGStrategy.convert(-2));
    }

    @Test
    void throwExceptionOnInputIsZero() {
        assertThrows(ResponseStatusException.class, ()->kgToGStrategy.convert(0));
    }




}