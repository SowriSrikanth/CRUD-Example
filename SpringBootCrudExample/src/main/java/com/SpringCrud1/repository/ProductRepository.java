package com.SpringCrud1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringCrud1.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{
	
	public Product findByName(String name);

}
