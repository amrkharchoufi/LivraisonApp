package com.example.produitservice.modele;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Document(collection = "Produits")
public class Produit {
    @Id
    private String idProduit;
    private String ProductName;
    private Double Price;
    private String Categorie;
}
