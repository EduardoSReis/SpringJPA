package com.dbserver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbserver.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository <OrderItem, Long>{

}
