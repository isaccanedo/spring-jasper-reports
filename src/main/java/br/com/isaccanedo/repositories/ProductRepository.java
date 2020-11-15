package br.com.isaccanedo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.isaccanedo.domain.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
