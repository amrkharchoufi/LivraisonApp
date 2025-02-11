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
            Livreur l = Livreur.builder().idLivreur("AGF").nom("ayoub").telephone("0657463728").latitude(25).longtitude(100).build();
            Livreur l1 = Livreur.builder().idLivreur("ANM").nom("Mouad").telephone("0657463728").latitude(-35).longtitude(45).build();
            r.save(l);
            r.save(l1);
        };
    }*/
}
