package com.webservices.webservices.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.webservices.entities.User;

@RestController
@RequestMapping(value ="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "maria", "maria@gmail.com", "3444242", "123123");
		return ResponseEntity.ok().body(u);
	}

}
