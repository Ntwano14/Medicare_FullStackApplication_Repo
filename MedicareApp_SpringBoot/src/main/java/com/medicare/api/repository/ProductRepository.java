package com.medicare.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare.api.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
