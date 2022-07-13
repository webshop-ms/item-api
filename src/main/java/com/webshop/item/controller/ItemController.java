package com.webshop.item.controller;

import com.webshop.item.facade.ItemFacade;
import com.webshop.item.model.dto.ItemDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/items")
@AllArgsConstructor
public class ItemController {

    private ItemFacade itemFacade;

    @GetMapping()
    public ResponseEntity<List<ItemDto>> getAllItems() {
        List<ItemDto> itemDtos = itemFacade.getAllItems();
        return new ResponseEntity<>(itemDtos, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> createItem(@RequestBody ItemDto itemDto) {
        itemFacade.createItem(itemDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
