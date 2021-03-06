package com.example.unitconversionapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class UnitConversionApiApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void contextLoads() {
    }

    @Test
    public void requestWithoutBodyShouldReturnBadRequest() throws Exception {
        this.mockMvc.perform(post("/convert")).andExpect(status().isBadRequest());
    }

    @Test
    public void requestWithBodyShouldReturnStatus200() throws Exception{
        this.mockMvc.perform(post("/convert")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"fromValue\": 1000,\"fromType\": \"g\", \"toType\": \"kg\"}"))
                .andExpect(status().isOk());
    }

    @Test
    public void requestCorrectshouldReturnCorrectOutput() throws Exception{
        this.mockMvc.perform(post("/convert")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"fromValue\": 1000,\"fromType\": \"g\", \"toType\": \"kg\"}"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .json("{\"result\":1.0,\"fromValue\":1000.0,\"fromType\":\"g\",\"toType\":\"kg\"}"));
    }
}
