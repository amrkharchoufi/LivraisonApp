package com.example.commandeservice.repository;

import com.example.commandeservice.entite.Commande;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommandeRepository extends MongoRepository<Commande,String> {
}
