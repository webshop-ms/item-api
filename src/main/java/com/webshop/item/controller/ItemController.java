package com.webshop.item.controller;

import com.webshop.item.model.dto.ItemDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/api/items")
public class ItemController {

    @GetMapping()
    public List<ItemDto> getAllItems() {
        return Arrays.asList(new ItemDto(UUID.fromString("ae26b580-59ce-4e1b-9e09-b109cde55507"), "dvd player", BigDecimal.valueOf(500)),
            new ItemDto(UUID.fromString("5358ffb2-5d38-411c-95ee-86eeca671cf1"), "Hifi", BigDecimal.valueOf(20000)));
    }
}
