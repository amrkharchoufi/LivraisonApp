package com.example.livreurservice.modele;


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
@Document(collection = "Livreurs")
public class Livreur {
    @Id
    private String idLivreur;
    private String nom;
    private double longtitude;
    private double latitude;
    private String telephone;

}
