package com.example.livreurservice;

import com.example.livreurservice.modele.Livreur;
import com.example.livreurservice.repository.LivreurRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LivreurServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LivreurServiceApplication.class, args);
    }
    /*
    @Bean
    CommandLineRunner start(LivreurRepository r){
        return  args -> {
            Livreur l = Livreur.builder().idLivreur("AGF").Nom("ayoub").telephone("0657463728").build();
            r.save(l);
        };
    }
   */
}
