package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.Users;
import com.example.demo.repositry.UserRepo;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public void run(String... args) throws Exception {
		String name ="ayaz";
		String userCode ="sakinaka";
		
		Users findByNameAndUserCode = userRepo.findByNameAndUserCode(name, userCode);
		System.out.println(findByNameAndUserCode);
		
		Users findByNameAndUserCodeByJPQL = userRepo.findByNameAndUserCodeByJPQL(name, userCode);
		System.out.println(findByNameAndUserCodeByJPQL);
		
	}

}
