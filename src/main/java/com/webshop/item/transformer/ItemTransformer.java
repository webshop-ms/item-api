package com.webshop.item.transformer;

import com.webshop.common.transformer.EntityTransformer;
import com.webshop.item.model.dto.ItemDto;
import com.webshop.item.model.entity.Item;

public class ItemTransformer extends EntityTransformer<ItemDto, Item> {

    @Override
    public ItemDto entityToDto(Item item) {
        if (item == null) {
            return null;
        }
        ItemDto dto = new ItemDto();
        dto.setId(item.getUuid());
        dto.setName(item.getName());
        dto.setUnitPrice(item.getUnitPrice());
        return dto;
    }

    @Override
    public Item dtoToEntity(ItemDto itemDto) {
        if (itemDto == null) {
            return null;
        }
        Item item = new Item();
        item.setUuid(itemDto.getId());
        item.setName(itemDto.getName());
        item.setUnitPrice(itemDto.getUnitPrice());
        return item;
    }
}