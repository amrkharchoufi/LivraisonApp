package com.example.clientservice.modele;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "Clients")
public class Client {
    @Id
    private String idClient;
    private String Nom;
    private String Ville;
    private double longtitude;
    private double latitude;
    private String adress;

}
