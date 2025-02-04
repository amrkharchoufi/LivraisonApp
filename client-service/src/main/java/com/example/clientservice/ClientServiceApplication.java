package com.example.clientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }
     /*
    @Bean
    CommandLineRunner start(ClientRepository Clientrepo){
        return args -> {
            Client c = Client.builder().nom("Amr").ville("temara").idClient("AD314145").latitude(14.0).longtitude(15.0).telephone("060059522307").build();
            Clientrepo.save(c);
        };
    }
*/
}
