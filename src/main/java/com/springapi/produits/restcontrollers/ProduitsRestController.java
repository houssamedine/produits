package com.springapi.produits.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springapi.produits.entites.Produits;
import com.springapi.produits.services.ProduitService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitsRestController {
	
	@Autowired
    ProduitService produitService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Produits> getAllProduits(){
		return produitService.getAllProduits();
	}
	
	@RequestMapping(value="/{idprod}", method = RequestMethod.GET)
	public Produits getProduitById(@PathVariable("idprod") Long id){
		return produitService.getProduit(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Produits addNewProduits(@RequestBody Produits p) {
		return produitService.saveProduit(p);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT)
	public Produits updateProduits(@RequestBody Produits p) {
		return produitService.updateProduit(p);
	}
	
	
	@RequestMapping(value="/{idprod}",method = RequestMethod.DELETE)
	public void deleteProduits(@PathVariable("idprod") Long id) {
		 produitService.deleteProduitById(id);
	}
	
	@RequestMapping(value="/prodscat/{idCategorie}",method = RequestMethod.GET)
	public List<Produits> getProduitsByCatId(@PathVariable("idCategorie") Long idCat) {
	return produitService.findByCategorieIdCat(idCat);
	}
	
	

}
