package com.webshop.item.controller;

import com.webshop.item.BaseIT;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class ItemControllerIT extends BaseIT {

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