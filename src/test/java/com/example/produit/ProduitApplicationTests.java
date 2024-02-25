package com.example.produit;

import org.glassfish.jaxb.runtime.v2.schemagen.xmlschema.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.produit.Entity.produitbureau;
import com.example.produit.repos.ProduitRepository;

@SpringBootTest
class ProduitApplicationTests {
	@Autowired
	private ProduitRepository produitrepository;
	 @Test
	public void Ajouter() {
		produitbureau pb=new produitbureau("05 Fevrier 2024","mouchoirs","1000");
		produitrepository.save(pb);
	}
	@Test
	public void rechercher() {
		produitbureau pb=produitrepository.findById(3L).get();
		if(pb!=null) {
		System.out.println(pb);
		}else {
			System.out.println("produit non trouve");
		}
	}
	@Test
	public void modifier() {
		produitbureau pb=produitrepository.findById(5L).get();
		pb.setDateproduit("24 septembre 2022");
		pb.setNomproduit("nivea");
		System.out.println(pb);
		produitrepository.save(pb);
		
	}
	@Test
	public void supprimer() {
		produitbureau pb=new produitbureau();
		produitrepository.deleteById(13L);
		
		
	}
	public Iterable<produitbureau> pb() {
		
	
	  Iterable<produitbureau> pb=produitrepository.findAll();
	  produitbureau prod=(produitbureau) pb;
	  while(prod==pb) {
		  System.out.println(prod);
	  }
	   return null;
	}	
	
	
	
	
	

}
