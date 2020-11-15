package br.com.isaccanedo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isaccanedo.domain.entities.Product;
import br.com.isaccanedo.service.ProductService;


@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
    private ProductService entityService;

    @PostMapping(value = "/product")
    public ResponseEntity<String> createUser(Product product){
       
        Product prod = entityService.create(product);
        if (prod != null) {
            return new ResponseEntity<>("Success",HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Failed",HttpStatus.BAD_REQUEST);
        }
    } 
    
    
}
