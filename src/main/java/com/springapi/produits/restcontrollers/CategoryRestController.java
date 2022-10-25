package com.springapi.produits.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springapi.produits.entites.Categorie;
import com.springapi.produits.repo.CategoryRepository;

@RestController
@RequestMapping("/api/cat")
@CrossOrigin("*")
public class CategoryRestController {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categorie> getAllCategories(){
		return categoryRepository.findAll();
	}
	
	@RequestMapping(value = "/{idCat}",method = RequestMethod.GET)
	public Categorie getCategorieById(@PathVariable("idCat") Long id) {
		return categoryRepository.findById(id).get();
	}
	
	

}
