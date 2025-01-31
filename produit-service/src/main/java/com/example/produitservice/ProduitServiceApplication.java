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
            Produit p1 = Produit.builder().ProductName("Pizza Pepperoni").Price(23.0).idProduit("pizzapep").Categorie("Pizza").build();
            Produit p2 = Produit.builder().ProductName("Tacos").Price(50.0).idProduit("tacos").Categorie("Tacos").build();
            Produit p3 = Produit.builder().ProductName("Cheese Burger").Price(35.0).idProduit("chbur").Categorie("Burger").build();
            Produit p4 = Produit.builder().ProductName("Nugget 6pc").Price(40.0).idProduit("ng6").Categorie("Nugget").build();
            prrepo.save(p1);
            prrepo.save(p2);
            prrepo.save(p3);
            prrepo.save(p4);
        };
    }
   */
}
