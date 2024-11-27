package com.smart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.smart.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	@Query("select u from User u where u.name = :name")
	public User getUserByUserName(@Param("name") String name);
	
	@Query("select u from User u where u.email = :email")
	public User getUserByUserEmail(@Param("email") String email);
}
