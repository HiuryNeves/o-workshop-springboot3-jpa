package com.webservices.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
