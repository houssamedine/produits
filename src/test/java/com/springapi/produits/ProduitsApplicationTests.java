package com.springapi.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springapi.produits.entites.Categorie;
import com.springapi.produits.entites.Produits;
import com.springapi.produits.repo.ProduitsReposetory;

@SpringBootTest
class ProduitsApplicationTests {

	@Autowired
	private ProduitsReposetory produitRepository;
	
	@Test
	public void testCreateProduit() {
	Produits prod = new Produits("PC HP",1500.500,new Date(), null);
	produitRepository.save(prod);
	
	System.out.println(prod);
	
	}
	
	@Test
	public void testGetByIDProduit() {
	Produits p= produitRepository.findById(1L).get();
	System.out.println("L'Id est: "+p);
	
	}
	
	@Test
	public void testUpdateProduit() {
	Produits p= produitRepository.findById(1L).get();
	p.setPrixProduit(3000.0);
	produitRepository.save(p);
	}
	
	@Test
	public void testDeleteByIdProduit() {
	produitRepository.deleteById(1L);
	}
	
	@Test
	public void testDeleteAllProduit() {
	produitRepository.deleteAll();
	}
	
	@Test
	public void testGetAllProduit() {
		List<Produits> prods = produitRepository.findAll();
		for (Produits p : prods)
		{
		System.out.println(p);
		}
	}
	
	@Test
	public void testFindByNomProduit() {
		List<Produits> prods = produitRepository.findByNomProduit("PC Dell");
		for (Produits p : prods)
		{
		System.out.println("le prosuit est::::: "+p);
		}
	}
	
	@Test
	public void testFindByNomProduitContains() {
		List<Produits> prods = produitRepository.findByNomProduitContains("PC");
		for (Produits p : prods)
		{
		System.out.println("le prosuit est::::: "+p);
		}
	}
	
	
	@Test
	public void testFindByNomPrixProduit() {
		List<Produits> prods = produitRepository.findByNomPrix("PC Dell",1000.0);
		for (Produits p : prods)
		{
		System.out.println("le prosuit est::::: "+p);
		}
	}
	
	@Test
	public void testFindByCategorie() {
		
		Categorie cat = new Categorie();
		cat.setIdCat(1L);
		List<Produits> prods = produitRepository.findByCategorie(cat);
		for (Produits p : prods)
		{
		System.out.println(p);
	}
	
	}
	
	@Test
	public void testGetCategorieByID() {
	List<Produits> prods = produitRepository.findByCategorieIdCat(1L);
	for (Produits p : prods)
	{
	System.out.println("le prosuit est::::: "+p);
	}
	}
	
	@Test
	public void testfindByOrderByNomProduitAsc()
	{
	List<Produits> prods =
	produitRepository.findByOrderByNomProduitAsc();
	for (Produits p : prods)
	{
	System.out.println(p);
	}
	}
	
	
	@Test
	public void testTrierProduitsNomsPrix()
	{
	List<Produits> prods = produitRepository.trierProduitsNomsPrix();
	for (Produits p : prods)
	{
	System.out.println(p);
	}
	}


}
