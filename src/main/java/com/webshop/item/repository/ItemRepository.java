package com.webshop.item.repository;

import com.webshop.item.model.entity.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

    Item findByUuid(UUID uuid);

}
