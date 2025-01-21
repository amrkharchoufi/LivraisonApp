package com.example.commandeservice.modele;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Livreur {
    private String idLivreur;
    private String Nom;
    private double longtitude;
    private double latitude;
    private String telephone;
}