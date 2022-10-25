package com.springapi.produits.entites;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="nomProd", types = {Produits.class})
public interface ProduitsProjection {

	public String getNomProduit();
}
