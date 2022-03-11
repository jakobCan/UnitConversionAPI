package com.example.unitconversionapi.conversion;

import com.example.unitconversionapi.controller.ConversionController;
import com.example.unitconversionapi.dto.Request;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import  static org.junit.jupiter.api.Assertions.*;

class CToFStrategyTest {


    CToFStrategy cToFStrategy;

    @BeforeEach
    void setup(){
        cToFStrategy = new CToFStrategy();
    }



    @Test
    void convert0Cto32F(){
        assertEquals(32f,cToFStrategy.convert(0f));
    }

    @Test
    void convertnegative17Cto0F() {
        assertEquals(0f,Math.round(cToFStrategy.convert(-17.78f)));
    }

    @Test
    void convert100cto212f(){
        assertEquals(212f,cToFStrategy.convert(100f));
    }

    @Test
    void convert1000cto1832f(){
        assertEquals(1832f,cToFStrategy.convert(1000f));
    }

}