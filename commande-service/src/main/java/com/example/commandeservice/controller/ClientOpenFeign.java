package com.example.commandeservice.controller;


import com.example.commandeservice.modele.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "CLIENT-SERVICE")
public interface ClientOpenFeign {
    @GetMapping("/clients")
    public List<Client> findAll();
    @GetMapping("/clients/{id}")
    public Client findById(@PathVariable String id);
}