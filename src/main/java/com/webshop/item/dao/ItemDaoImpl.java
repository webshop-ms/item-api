package com.webshop.item.dao;

import com.webshop.common.dao.EntityDaoImpl;
import com.webshop.item.model.entity.Item;
import com.webshop.item.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ItemDaoImpl extends EntityDaoImpl<Item, ItemRepository> implements ItemDao {

    public ItemDaoImpl(ItemRepository repository) {
        super(repository);
    }

    @Override
    public Item getItemByUuid(String uuid) {
        return repository.findByUuid(UUID.fromString(uuid));
    }
}
