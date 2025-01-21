package com.example.livreurservice.repository;

import com.example.livreurservice.modele.Livreur;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LivreurRepository extends MongoRepository<Livreur,String> {
}
