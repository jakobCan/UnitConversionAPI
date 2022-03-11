package com.example.unitconversionapi.conversion;

import com.example.unitconversionapi.dto.Request;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class ConversionServiceTest {

    ConversionService conversionService;
    ConversionStrategy conversionStrategy;

    @BeforeEach
    void setup(){
        conversionStrategy = mock(ConversionStrategy.class);
        when(conversionStrategy.getConversionCode()).thenReturn("gkg");
        List<ConversionStrategy> list = new ArrayList<>();
        list.add(conversionStrategy);
        conversionService = new ConversionService(list);
    }

    @Test
    void convertCallsConvertMethod() {
        Request mockRequest = new Request(55000f, "g", "kg");
        conversionService.convert(mockRequest);
        verify(conversionStrategy, times(1)).convert(anyFloat());
    }
}