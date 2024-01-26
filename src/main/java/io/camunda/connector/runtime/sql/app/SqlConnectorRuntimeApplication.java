package io.camunda.connector.runtime.sql.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqlConnectorRuntimeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqlConnectorRuntimeApplication.class, args);
    }
}