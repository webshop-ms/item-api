package com.webshop.item.controller;

import com.webshop.common.model.dto.ItemDto;
import com.webshop.common.model.entity.Identity;
import com.webshop.item.facade.ItemFacade;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Pattern;
import java.util.List;

@RestController
@RequestMapping(value = "/api/items")
@AllArgsConstructor
@Validated
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

    @GetMapping("/{id}")
    public ResponseEntity<ItemDto> getItem(@PathVariable(name = "id") @Pattern(regexp = Identity.UUID_REGEX) String uuid) {
        ItemDto itemDto = itemFacade.getItem(uuid);
        return new ResponseEntity<>(itemDto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable(name = "id") @Pattern(regexp = Identity.UUID_REGEX) String uuid) {
        itemFacade.deleteItemByUuid(uuid);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/find-all-by")
    public ResponseEntity<List<ItemDto>> getAllItemsByUuid(@RequestParam List<@Pattern(regexp = Identity.UUID_REGEX) String> uuids) {
        List<ItemDto> itemDtos = itemFacade.getItemsByUuids(uuids);
        return new ResponseEntity<>(itemDtos, HttpStatus.OK);
    }

}
