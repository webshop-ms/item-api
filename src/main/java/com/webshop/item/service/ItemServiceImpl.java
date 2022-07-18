package com.webshop.item.service;

import com.webshop.common.service.EntityServiceImpl;
import com.webshop.item.dao.ItemDao;
import com.webshop.item.model.entity.Item;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl extends EntityServiceImpl<Item, ItemDao> implements ItemService {

    public ItemServiceImpl(ItemDao dao) {
        super(dao);
    }
}
