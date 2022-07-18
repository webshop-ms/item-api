package com.webshop.item.facade;

import com.webshop.item.model.dto.ItemDto;
import com.webshop.item.model.entity.Item;
import com.webshop.item.service.ItemService;
import com.webshop.item.transformer.ItemTransformer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@AllArgsConstructor
public class ItemFacade {

    private ItemService itemService;
    private ItemTransformer itemTransformer;

    @Transactional
    public void createItem(ItemDto itemDto) {
        Item item = itemTransformer.dtoToEntity(itemDto);
        itemService.save(item);
    }

    @Transactional(readOnly = true)
    public List<ItemDto> getAllItems() {
        List<Item> items = itemService.getAll();
        return itemTransformer.entityListToDtoList(items);
    }

    @Transactional(readOnly = true)
    public ItemDto getItem(String uuid) {
        Item item = itemService.getItemByUuid(uuid);
        return itemTransformer.entityToDto(item);
    }
}
