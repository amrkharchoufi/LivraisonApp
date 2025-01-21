package com.example.clientservice.controller;


import com.example.clientservice.modele.Client;
import com.example.clientservice.repository.ClientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    private ClientRepository ClientRepo;
    ClientController(ClientRepository client){
        this.ClientRepo=client;
    }
    @GetMapping("/clients")
    public List<Client> getClients(){
        return ClientRepo.findAll();
    }
    @GetMapping("/clients/{id}")
    public Client getClient(@PathVariable(name = "id") String code) {
        return ClientRepo.findById(code).get();
    }

    @PostMapping("/clients")
    public void addClient(@RequestBody Client client){
        ClientRepo.save(client);
    }
    @DeleteMapping("/clients/{id}")
    public void DeleteClient(@PathVariable(name = "id") String code){
        ClientRepo.deleteById(code);
    }
    @PutMapping("/clients/{id}")
    public void UpdateClient(@PathVariable(name = "id") String code,@RequestBody Client c){
        Client c1=ClientRepo.findById(code).get();
        c1.setNom(c.getNom());
        c1.setVille(c.getVille());
        c1.setAdress(c.getAdress());
        c1.setLatitude(c.getLatitude());
        c1.setLongtitude(c.getLongtitude());
        ClientRepo.save(c1);
    }
}
