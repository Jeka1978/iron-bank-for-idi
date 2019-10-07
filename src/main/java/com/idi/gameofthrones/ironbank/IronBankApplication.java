package com.idi.gameofthrones.ironbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class IronBankApplication {

    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        ConfigurableApplicationContext context = SpringApplication.run(IronBankApplication.class, args);
        System.out.println();
    }

}
