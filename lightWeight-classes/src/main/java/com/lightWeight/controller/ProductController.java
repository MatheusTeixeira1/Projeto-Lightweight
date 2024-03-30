package com.lightWeight.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lightWeight.model.Product;
import com.lightWeight.repository.ProductRepository;

@RestController
@RequestMapping("/api/product")
public class ProductController {


    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/{idProduct}")
    public Product getProductById(@PathVariable(name = "idProduct") Long idProduct) {
        return productRepository.findById(idProduct).orElse(null);
    }
    
    @DeleteMapping("/{idProduct}")
    public void deleteProduct(@PathVariable(name = "idProduct") Long idProduct) {
        productRepository.deleteById(idProduct);
    }
    
    
    @PutMapping("/{idProduct}/update")
    public Product update(@PathVariable(name = "idProduct") Long idProduct, @RequestBody Product updatedProduct) {
        Product existingProduct = productRepository.findById(idProduct).orElse(null);

        
        if (existingProduct != null) {
        	if(updatedProduct.getName() != null) {
            	existingProduct.setName(updatedProduct.getName());
            	
            }
            if(!Objects.isNull(updatedProduct.getPrice())) {
            	existingProduct.setPrice(updatedProduct.getPrice());
            	
            }
            if(updatedProduct.getDescription() !=null) {
            	existingProduct.setDescription(updatedProduct.getDescription());
            	
            }
            if(updatedProduct.getRawWeight() !=null) {
            	existingProduct.setRawWeight(updatedProduct.getRawWeight());
            	
            }
            if(!Objects.isNull(updatedProduct.getAmount())) {
            	existingProduct.setAmount(updatedProduct.getAmount());
            	
            }
            return productRepository.save(existingProduct);
        }

        return null;
    }
}
