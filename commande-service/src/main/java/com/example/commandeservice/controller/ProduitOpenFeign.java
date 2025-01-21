package com.example.commandeservice.controller;

import com.example.commandeservice.modele.Produit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "PRODUIT-SERVICE")
public interface ProduitOpenFeign {
    @GetMapping("/produits")
    public List<Produit> findAll();
    @GetMapping("/produits/{id}")
    public Produit findById(@PathVariable String id);
}