package com.webshop.item.facade;

import com.webshop.item.service.ItemService;
import org.springframework.stereotype.Component;

@Component
public class ItemFacade {

    private ItemService itemService;

    public ItemFacade(ItemService itemService) {
        this.itemService = itemService;
    }

}
