package com.dbserver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbserver.entities.Product;

public interface ProductRepository extends JpaRepository <Product, Long>{

}
