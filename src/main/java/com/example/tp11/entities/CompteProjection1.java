package com.example.tp11.entities;
import org.springframework.data.rest.core.config.Projection;
import com.example.tp11.entities.Compte;
@Projection(name = "solde", types = Compte.class)
public interface CompteProjection1 {
    double getSolde();
}

