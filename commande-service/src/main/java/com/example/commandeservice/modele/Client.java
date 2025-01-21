package com.example.commandeservice.modele;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Client {
    private String IdClient;
    private String Nom;
    private String Ville;
    private double longtitude;
    private double latitude;
    private String adress;
}
