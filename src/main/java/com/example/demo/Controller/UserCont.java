package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Users;
import com.example.demo.service.UserService;

@RestController
public class UserCont {
	@Autowired
	UserService userService;

	@PostMapping("/users")
	public Users saveUsers(@RequestBody Users user) {
		return userService.saveUser(user);

	}

	@GetMapping("/users")
	public List<Users> fechUser() {
		return userService.fechUsersList();
	}

	@PutMapping("/users/{id}")
	public Users updateUsers(@RequestBody Users user, @PathVariable("id") Integer userId) {
		return userService.updateUser(user, userId);

	}

	@DeleteMapping("/userss/{id}")

	public String deleteDepartmentById(@PathVariable("id") Integer userId) {
		userService.deleteById(userId);
		return "Deleted Successfully";
	}
}
