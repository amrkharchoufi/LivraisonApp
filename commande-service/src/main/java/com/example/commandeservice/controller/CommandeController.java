package com.example.commandeservice.controller;

import com.example.commandeservice.modele.Client;
import com.example.commandeservice.modele.Commande;
import com.example.commandeservice.modele.Produit;
import com.example.commandeservice.modele.commandeItem;
import com.example.commandeservice.repository.CommandeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController

public class CommandeController {
    private CommandeRepository commandeRepository;
    private ProduitOpenFeign produitOpenFeign;
    private ClientOpenFeign clientOpenFeign;

    public CommandeController(CommandeRepository cmd,ProduitOpenFeign pd,ClientOpenFeign cl){
        this.commandeRepository=cmd;
        this.produitOpenFeign=pd;
        this.clientOpenFeign=cl;
    }

    @GetMapping("/commandes")
    public List<Commande> getallcmd(){
        List<Commande> cmd= commandeRepository.findAll();
        for(Commande c :cmd){
            for(commandeItem item : c.getItems()){
                Produit p = produitOpenFeign.findById(item.getIdProduit());
                p.setQuantity(item.getQuantity());
                c.getProducts().add(p);
            }
            Client cl = clientOpenFeign.findById(c.getIdClient());
            c.setClient(cl);
        }
        return cmd;
    }
}
