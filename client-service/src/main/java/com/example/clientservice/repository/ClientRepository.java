package com.example.clientservice.repository;

import com.example.clientservice.modele.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Client,String> {
}
