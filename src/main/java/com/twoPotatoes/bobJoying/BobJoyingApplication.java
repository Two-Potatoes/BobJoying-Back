package com.twoPotatoes.bobJoying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class BobJoyingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BobJoyingApplication.class, args);
    }

}
