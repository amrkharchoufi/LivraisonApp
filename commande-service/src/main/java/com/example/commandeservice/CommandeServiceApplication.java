package com.example.commandeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CommandeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommandeServiceApplication.class, args);
    }
    /*
    @Bean
    CommandLineRunner start(CommandeRepository cmd){
        return args -> {
            commandeItem c1=commandeItem.builder().idProduit("EFG").Quantity(4).build();
            commandeItem c2=commandeItem.builder().idProduit("CDF").Quantity(4).build();
            List<commandeItem> prdct = new LinkedList<>();
            prdct.add(c1);
            prdct.add(c2);
            Commande cmd1= Commande.builder().idCmd("HZEDUB").Items(prdct).idClient("AD314145").status(CommandeStatus.PENDING).idLivreur("AGF").build();
            cmd.save(cmd1);
        };
    }*/
}
