package com.example.unitconversionapi.controller;

import com.example.unitconversionapi.conversion.ConversionService;
import com.example.unitconversionapi.conversion.ConversionStrategy;
import com.example.unitconversionapi.dto.Request;
import com.example.unitconversionapi.dto.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ConversionControllerTest {

    ConversionController conversionController;
    ConversionService conversionService;
    Request request;



    @BeforeEach
    void setup(){
        conversionService = mock(ConversionService.class);
        conversionController = new ConversionController(conversionService);
    }


    @Test
    void checkMethodCallConvert() {
        request = new Request(1000f, "g", "kg");
        conversionController.convert(request);
        verify(conversionService, times(1)).convert(any());

    }
}
