package com.springapi.produits.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.springapi.produits.entites.Categorie;

@RepositoryRestResource(path = "cat")
@CrossOrigin(origins="http://localhost:4200/")
public interface CategoryRepository extends JpaRepository<Categorie, Long> {

}
