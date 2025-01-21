package com.example.commandeservice.modele;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Produit {
    private String idProduit;
    private String ProductName;
    private double price;
    private int quantity;
}
