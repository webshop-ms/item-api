package com.webshop.item.dao;

import com.webshop.common.dao.EntityDaoImpl;
import com.webshop.item.model.entity.Item;
import com.webshop.item.repository.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemDaoImpl extends EntityDaoImpl<Item, ItemRepository> implements ItemDao {

    public ItemDaoImpl(ItemRepository repository) {
        super(repository);
    }

}
