package com.webservices.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.webservices.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
