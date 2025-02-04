package com.example.clientservice.entite;

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
    private String nom;
    private String ville;
    private Double longtitude;
    private Double latitude;
    private String adress;
    private String telephone;

}