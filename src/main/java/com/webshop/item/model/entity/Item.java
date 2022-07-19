package com.webshop.item.model.entity;

import com.webshop.common.model.entity.Identity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;


@Entity
@Data
@Table(name = "items")
public class Item extends Identity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal unitPrice;

}
