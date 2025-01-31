package com.example.commandeservice.modele;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class commandeItem {
    private String idProduit;
    private int  quantity;
}
