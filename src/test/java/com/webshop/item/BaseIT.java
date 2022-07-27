package com.webshop.item;

import org.junit.ClassRule;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Testcontainers;

@ActiveProfiles("test")
@Testcontainers
public class BaseIT {

    @ClassRule
    static MySQLContainer<?> mysql = new MySQLContainer<>("mysql:latest")
        .withDatabaseName("testitemdb");

}
