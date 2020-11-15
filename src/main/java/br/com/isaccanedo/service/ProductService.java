package br.com.isaccanedo.service;

import java.util.List;

import br.com.isaccanedo.domain.entities.Product;

public interface ProductService {

	Product create(Product product);
	List<Product> getAll();
}
