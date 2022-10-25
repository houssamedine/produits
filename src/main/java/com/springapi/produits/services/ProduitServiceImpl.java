package com.springapi.produits.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapi.produits.entites.Categorie;
import com.springapi.produits.entites.Produits;
import com.springapi.produits.repo.ProduitsReposetory;

@Service
public class ProduitServiceImpl  implements ProduitService{

	@Autowired
	ProduitsReposetory produitRepository;
	@Override
	public Produits saveProduit(Produits p) {
		return produitRepository.save(p);
	}
	@Override
	public Produits updateProduit(Produits p) {
	return produitRepository.save(p);
	}
	@Override
	public void deleteProduit(Produits p) {
	produitRepository.delete(p);
	}
	 @Override
	public void deleteProduitById(Long id) {
	produitRepository.deleteById(id);
	}
	@Override
	public Produits getProduit(Long id) {
	return produitRepository.findById(id).get();
	}
	@Override
	public List<Produits> getAllProduits() {
	return produitRepository.findAll();
	}
	@Override
	public List<Produits> findByNomProduit(String nom) {
		return produitRepository.findByNomProduit(nom);
	}
	@Override
	public List<Produits> findByNomProduitContains(String nom) {
		return produitRepository.findByNomProduitContains(nom);
	}
	@Override
	public List<Produits> findByNomPrix(String nom, Double prix) {
		return produitRepository.findByNomPrix(nom, prix);
	}
	@Override
	public List<Produits> findByCategorie(Categorie categorie) {
		return produitRepository.findByCategorie(categorie);
	}
	@Override
	public List<Produits> findByCategorieIdCat(Long id) {
		return produitRepository.findByCategorieIdCat(id);
	}
	@Override
	public List<Produits> findByOrderByNomProduitAsc() {
		return produitRepository.findByOrderByNomProduitAsc();
	}
	@Override
	public List<Produits> trierProduitsNomsPrix() {
		return produitRepository.trierProduitsNomsPrix();
	}

}
