package com.webshop.item.dao;

import com.webshop.item.model.entity.Identity;

import java.util.List;

public interface EntityDao<Entity extends Identity> {

    Entity getById(Long id);

    void deleteById(Long id);

    Entity save(Entity entity);

    List<Entity> getAll();
}
