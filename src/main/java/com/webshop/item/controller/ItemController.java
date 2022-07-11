package com.webshop.item.controller;

import com.webshop.common.transformer.EntityTransformer;
import com.webshop.item.model.dto.ItemDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/api/items")
public class ItemController {

    @GetMapping()
    public List<ItemDto> getAllItems(){
        return Arrays.asList(new ItemDto("mockId","dvd player"), new ItemDto("mockId2", "Hifi"));
    }
}
