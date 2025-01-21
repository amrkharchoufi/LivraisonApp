package com.example.clientservice;

import com.example.clientservice.modele.Client;
import com.example.clientservice.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }
    /*
    @Bean
    CommandLineRunner start(ClientRepository Clientrepo){
        return args -> {
            Client c = Client.builder().Nom("Amr").Ville("temara").idClient("AD314145").telephone("060059522307").build();
            Client c1 = Client.builder().Nom("Wiame").Ville("sale").idClient("AAAAAA").build();
            Client c2 = Client.builder().Nom("Ghayt").Ville("rabat").idClient("BBBBBB").build();
            Client c3 = Client.builder().Nom("Nayla").Ville("casa").idClient("CCCCCC").build();
            Clientrepo.save(c);
            Clientrepo.save(c1);
            Clientrepo.save(c2);
            Clientrepo.save(c3);
        };
    }
    */


}
