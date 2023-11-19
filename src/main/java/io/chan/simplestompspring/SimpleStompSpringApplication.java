package io.chan.simplestompspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "io.chan")
public class SimpleStompSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleStompSpringApplication.class, args);
    }

}
