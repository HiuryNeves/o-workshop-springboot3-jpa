package com.webservices.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.webservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
