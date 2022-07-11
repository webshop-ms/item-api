package com.webshop.item.controller;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
public class ItemControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Retrieve all item")
    void getAllItems() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/items"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$").value(Matchers.hasSize(2)))
            .andExpect(MockMvcResultMatchers.jsonPath("$[0].name").value("dvd player"));
    }
}