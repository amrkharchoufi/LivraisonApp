package com.example.commandeservice.entite;


import com.example.commandeservice.modele.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.LinkedList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "commandes")
public class Commande {
    @Id
    private String idCmd;
    @JsonProperty("items")
    private List<commandeItem> items;
    private String idClient;
    private String idLivreur;
    private CommandeStatus status=CommandeStatus.PENDING;

    @Transient
    private List<Produit> products=new LinkedList<>();

    @Transient
    private Client client;

    @Transient
    private Livreur livreur;

}
