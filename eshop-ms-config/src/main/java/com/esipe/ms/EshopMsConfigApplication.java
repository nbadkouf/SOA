package com.esipe.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EshopMsConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(EshopMsConfigApplication.class, args);
    }

}
