package com.springapi.produits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.springapi.produits.entites.Categorie;
import com.springapi.produits.entites.Produits;

@SpringBootApplication
public class ProduitsApplication implements CommandLineRunner{
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(ProduitsApplication.class, args);
	}

	
	//pour Retourner l’ID avec Spring Data REST
	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Categorie.class,Produits.class);
		
	}

}
