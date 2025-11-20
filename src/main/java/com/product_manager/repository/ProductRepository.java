package com.product_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product_manager.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
