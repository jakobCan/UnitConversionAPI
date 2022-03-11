package com.example.unitconversionapi.conversion;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class KgToGStrategy implements ConversionStrategy{

    @Override
    public float convert(float f) throws ResponseStatusException{
        if (f <= 0){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Value must be positive.");
        }
        return f * 1000.f;
    }

    @Override
    public String getConversionCode() {
        return "kgg";
    }
}
