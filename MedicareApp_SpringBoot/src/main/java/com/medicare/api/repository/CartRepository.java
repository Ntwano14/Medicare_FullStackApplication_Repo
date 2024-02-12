package com.medicare.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare.api.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{

}
