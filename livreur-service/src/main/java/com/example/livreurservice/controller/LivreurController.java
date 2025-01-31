package com.example.livreurservice.controller;

import com.example.livreurservice.modele.Livreur;
import com.example.livreurservice.repository.LivreurRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LivreurController {
    private LivreurRepository livreurRepository;

    public LivreurController(LivreurRepository r){
        this.livreurRepository=r;
    }
    @GetMapping("/livreurs")
    public List<Livreur> getlivreurs(){
        return livreurRepository.findAll();
    }
    @GetMapping("/livreurs/{id}")
    public Livreur getLivreur(@PathVariable(name = "id") String code) {
        return livreurRepository.findById(code).get();
    }

    @PostMapping("/livreurs")
    public void addLivreur(@RequestBody Livreur Livreur){
        livreurRepository.save(Livreur);
    }
    @DeleteMapping("/livreurs/{id}")
    public void DeleteLivreur(@PathVariable(name = "id") String code){
        livreurRepository.deleteById(code);
    }
    @PutMapping("/livreurs/{id}")
    public void UpdateLivreur(@PathVariable(name = "id") String code,@RequestBody Livreur c){
        Livreur c1=livreurRepository.findById(code).get();
        c1.setNom(c.getNom());
        c1.setNom(c.getNom());
        c1.setTelephone(c.getTelephone());
        c1.setLatitude(c.getLatitude());
        c1.setLongtitude(c.getLongtitude());
        livreurRepository.save(c1);
    }

    // In LivreurController.java
    @PutMapping("/livreurs/{id}/location")
    public void updateLocation(
            @PathVariable String id,
            @RequestParam double latitude,
            @RequestParam double longitude) {

        Livreur livreur = livreurRepository.findById(id).orElseThrow();
        livreur.setLatitude(latitude);
        livreur.setLongtitude(longitude);
        livreurRepository.save(livreur);
    }
}
