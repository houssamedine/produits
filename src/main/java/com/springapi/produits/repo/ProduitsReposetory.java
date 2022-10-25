package com.springapi.produits.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springapi.produits.entites.Categorie;
import com.springapi.produits.entites.Produits;

@RepositoryRestResource(path = "rest")
public interface ProduitsReposetory extends JpaRepository<Produits, Long>{

	List<Produits> findByNomProduit(String nom);
	
	List<Produits> findByNomProduitContains(String nom);
	
	
	//Pour Faire Une Méthode Avec une Requette JPQL il exist deux façon:
	////////////1 ére Methode:c'est il n'y a pas beaucoup des parametre:
	/*@Query("select p from Produits p where p.nomProduit like %?1 and p.prixProduit > ?2")  //en manipule les champs de l'entite Produits 
	List<Produits> findByNomPrix(String nom, Double prix);*/
	
    ////////////2 éme Methode: C'est il y'a beaucoup des parametre:
	@Query("select p from Produits p where p.nomProduit like %:nom and p.prixProduit > :prix")
	List<Produits> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);

	@Query("select p from Produits p where p.categorie = ?1")
	List<Produits> findByCategorie (Categorie categorie);
	
	List<Produits> findByCategorieIdCat(Long id);
	
	List<Produits> findByOrderByNomProduitAsc();
	
	@Query("select p from Produits p order by p.nomProduit ASC, p.prixProduit DESC")
	List<Produits> trierProduitsNomsPrix ();
}
