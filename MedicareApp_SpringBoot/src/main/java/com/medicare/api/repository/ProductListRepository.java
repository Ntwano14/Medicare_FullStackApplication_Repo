package com.medicare.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare.api.entity.ProductList;

@Repository
public interface ProductListRepository extends JpaRepository<ProductList, Integer>{

}
