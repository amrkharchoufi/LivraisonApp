package com.example.commandeservice;

import com.example.commandeservice.modele.Commande;
import com.example.commandeservice.modele.CommandeStatus;
import com.example.commandeservice.modele.Produit;
import com.example.commandeservice.modele.commandeItem;
import com.example.commandeservice.repository.CommandeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.LinkedList;
import java.util.List;

@SpringBootApplication
@EnableFeignClients
public class CommandeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommandeServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CommandeRepository cmd){
        return args -> {
            commandeItem c1=commandeItem.builder().idProduit("ABC").Quantity(4).build();
            commandeItem c2=commandeItem.builder().idProduit("GAB").Quantity(4).build();
            List<commandeItem> prdct = new LinkedList<>();
            prdct.add(c1);
            prdct.add(c2);
            Commande cmd1= Commande.builder().idCmd("HZEDUB").Items(prdct).idClient("AD314145").status(CommandeStatus.PENDING).build();
            cmd.save(cmd1);
        };
    }
}
