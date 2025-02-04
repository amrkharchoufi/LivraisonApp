package com.example.clientservice.repository;

import com.example.clientservice.entite.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Client,String> {
}