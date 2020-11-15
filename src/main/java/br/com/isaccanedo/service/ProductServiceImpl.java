package br.com.isaccanedo.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.isaccanedo.domain.entities.Product;
import br.com.isaccanedo.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository repository;

	@Override
	public Product create(Product product) {

		Product entity;

		try {
			entity = repository.save(product);
		} catch (Exception ex) {
			return null;
		}
		return entity;
	}

	public List<Product> getAll() {
		return repository.findAll();
	}
}
