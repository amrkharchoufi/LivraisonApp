package com.example.commandeservice.controller;

import com.example.commandeservice.modele.*;
import com.example.commandeservice.repository.CommandeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

@RestController

public class CommandeController {
    private CommandeRepository commandeRepository;
    private ProduitOpenFeign produitOpenFeign;
    private ClientOpenFeign clientOpenFeign;
    private LivreurOpenFeign livreurOpenFeign;

    public CommandeController(CommandeRepository cmd,ProduitOpenFeign pd,ClientOpenFeign cl,LivreurOpenFeign l){
        this.commandeRepository=cmd;
        this.produitOpenFeign=pd;
        this.clientOpenFeign=cl;
        this.livreurOpenFeign=l;
    }

    private List<Commande> getCommandes(List<Commande> cmd) {
        for(Commande c :cmd){
            for(commandeItem item : c.getItems()){
                Produit p = produitOpenFeign.findById(item.getIdProduit());
                p.setQuantity(item.getQuantity());
                c.getProducts().add(p);
            }
            Client cl = clientOpenFeign.findById(c.getIdClient());
            c.setClient(cl);
            Livreur l1 = livreurOpenFeign.findById(c.getIdLivreur());
            c.setLivreur(l1);
        }
        return cmd;
    }

    @GetMapping("/commandes")
    public List<Commande> getallcmd(){
        List<Commande> cmd= commandeRepository.findAll();
        return getCommandes(cmd);
    }

    @GetMapping("/commandes/livr/{id}")
    public List<Commande> getcmdbyLivr(@PathVariable(name = "id") String id){
        Predicate<Commande> ps = cmd -> cmd.getIdLivreur().equals(id);
        List<Commande> cmd = commandeRepository.findAll().stream().filter(ps).toList();

        return getCommandes(cmd);
    }
}
