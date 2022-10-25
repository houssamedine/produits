package com.springapi.produits.entites;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                  /*Gener des getters and setters*/
@NoArgsConstructor	   /*Constructeur Sans Parameteres*/
@AllArgsConstructor	   /*Constructeur avec Parameteres*/
@Entity
public class Categorie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCat;
	private String nomCat;
	private String description;
	
	@OneToMany(mappedBy = "categorie")
	@JsonIgnore
	private List<Produits> produits;
	
}