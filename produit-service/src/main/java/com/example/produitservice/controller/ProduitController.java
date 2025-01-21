package com.example.produitservice.controller;


import com.example.produitservice.modele.Produit;
import com.example.produitservice.repository.ProduitRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProduitController {
    private ProduitRepository ProduitRepo;
    ProduitController(ProduitRepository  produit){
        this.ProduitRepo=produit;
    }
    @GetMapping("/produits")
    public List<Produit> getProduits(){
        return ProduitRepo.findAll();
    }
    @GetMapping("/produits/{id}")
    public Produit getProduit(@PathVariable(name = "id") String code){
        return ProduitRepo.findById(code).get();
    }
    @PostMapping("/produits")
    public void addProduit(@RequestBody Produit client){
        ProduitRepo.save(client);
    }
    @DeleteMapping("/produits/{id}")
    public void DeleteProduit(@PathVariable(name = "id") String code){
        ProduitRepo.deleteById(code);
    }
    @PutMapping("/produits/{id}")
    public void UpdateProduit(@PathVariable(name = "id") String code,@RequestBody Produit c){
        Produit c1=ProduitRepo.findById(code).get();
        c1.setProductName(c.getProductName());
        c1.setPrice(c.getPrice());
        ProduitRepo.save(c1);
    }

}
