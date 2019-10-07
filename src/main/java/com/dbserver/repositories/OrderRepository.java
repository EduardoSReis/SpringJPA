package com.dbserver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbserver.entities.Order;

public interface OrderRepository extends JpaRepository <Order, Long>{

}
