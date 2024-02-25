package com.example.produit.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.produit.Entity.produitbureau;

public interface ProduitRepository extends JpaRepository<produitbureau, Long> {

}
