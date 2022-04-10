package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.Product;
import com.Repository.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	ProductRepository repository;
	
	public Product saveProduct(Product product) {
		return repository.save(product);
	}
	
	public List<Product> saveAllProducts(List<Product> products){
		return repository.saveAll(products);
	}
	
	public List<Product> getproducts(){
		return repository.findAll();
	}
	
	public Product getProductById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public Product getProductByName(String name) {
		return repository.findByName(name);
	}
	
	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "Product Deleted" + id;
	}
	
	public Product updateProduct(Product product) {
		Product existingProduct = repository.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setPrice(product.getPrice());
		existingProduct.setQuantity(product.getQuantity());
		
		return repository.save(existingProduct);
	}
	

}
