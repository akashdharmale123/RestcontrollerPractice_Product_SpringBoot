package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	public Product findByName(String name);

}
