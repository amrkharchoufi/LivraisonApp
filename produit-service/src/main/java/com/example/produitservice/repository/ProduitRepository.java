package com.example.produitservice.repository;

import com.example.produitservice.modele.Produit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProduitRepository extends MongoRepository<Produit,String> {
}
