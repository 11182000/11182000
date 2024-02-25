package com.example.produit.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class produitbureau {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String nomproduit;
private String dateproduit;
private String prixproduit;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNomproduit() {
	return nomproduit;
}
public void setNomproduit(String nomproduit) {
	this.nomproduit = nomproduit;
}
public String getDateproduit() {
	return dateproduit;
}
public void setDateproduit(String dateproduit) {
	this.dateproduit = dateproduit;
}
public String getPrixproduit() {
	return prixproduit;
}
public void setPrixproduit(String prixproduit) {
	this.prixproduit = prixproduit;
}
public produitbureau() {
	super();
	// TODO Auto-generated constructor stub
}


public produitbureau(String nomproduit, String dateproduit, String prixproduit) {
	super();
	this.nomproduit = nomproduit;
	this.dateproduit = dateproduit;
	this.prixproduit = prixproduit;
}
@Override
public String toString() {
	return "produitbureau [id=" + id + ", nomproduit=" + nomproduit + ", dateproduit=" + dateproduit + ", prixproduit="
			+ prixproduit + "]";
}

}
