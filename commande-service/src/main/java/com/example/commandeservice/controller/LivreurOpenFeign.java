package com.example.commandeservice.controller;

import com.example.commandeservice.modele.Livreur;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "LIVREUR-SERVICE")
public interface LivreurOpenFeign {
    @GetMapping("/livreurs")
    public List<Livreur> findAll();
    @GetMapping("/livreurs/{id}")
    public Livreur findById(@PathVariable String id);
}


