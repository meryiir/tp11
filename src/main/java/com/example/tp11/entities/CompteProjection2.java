package com.example.tp11.entities;


import org.springframework.data.rest.core.config.Projection;
import com.example.tp11.entities.Compte;
import com.example.tp11.repositories.TypeCompte;

@Projection(name = "mobile", types = Compte.class)
public interface CompteProjection2 {
    double getSolde();
    TypeCompte getType();
}
