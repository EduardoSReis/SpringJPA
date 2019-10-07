package com.dbserver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbserver.entities.Category;

public interface CategoryRepository extends JpaRepository <Category, Long>{

}
