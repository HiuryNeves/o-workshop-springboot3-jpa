package com.webservices.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.webservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
