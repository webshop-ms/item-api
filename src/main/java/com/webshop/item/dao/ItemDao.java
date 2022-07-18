package com.webshop.item.dao;

import com.webshop.common.dao.EntityDao;
import com.webshop.item.model.entity.Item;

public interface ItemDao extends EntityDao<Item> {

    Item getItemByUuid(String uuid);

}
