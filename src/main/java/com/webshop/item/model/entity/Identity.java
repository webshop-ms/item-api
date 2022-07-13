package com.webshop.item.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.UUID;

// TODO put it to common somehow
@MappedSuperclass
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Identity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    // TODO it does not generate uuid
    // TODO set nullable false
    @Column(nullable = true, unique = true)
    @GeneratedValue(generator = "UUID")
    private UUID uuid;

}
