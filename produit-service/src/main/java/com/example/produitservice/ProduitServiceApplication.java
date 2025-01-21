package com.example.produitservice;

import com.example.produitservice.modele.Produit;
import com.example.produitservice.repository.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProduitServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProduitServiceApplication.class, args);
    }
   /*
    @Bean
    CommandLineRunner start(ProduitRepository prrepo){
        return args -> {
            Produit p1 = Produit.builder().ProductName("asus").Price(140000.0).idProduit("ABC").build();
            Produit p2 = Produit.builder().ProductName("brownies").Price(150.0).idProduit("CDF").build();
            Produit p3 = Produit.builder().ProductName("Iphone 16").Price(20000.0).idProduit("EFG").build();
            prrepo.save(p1);
            prrepo.save(p2);
            prrepo.save(p3);
        };
    }*/

}
