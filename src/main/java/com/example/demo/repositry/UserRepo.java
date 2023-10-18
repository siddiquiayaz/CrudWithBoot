package com.example.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {

	Users findByNameAndUserCode(String name, String userCode);

	@Query(value = "SELECT u FROM Users u where u.name=?1 and u.userCode=?2")
	Users findByNameAndUserCodeByJPQL(String name, String userCode);

}