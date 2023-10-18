package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Users;
import com.example.demo.repositry.UserRepo;

@Service
public class UserServiceImp implements UserService {
	@Autowired
	UserRepo repo;

	@Override
	public Users saveUser(Users user) {
       return repo.save(user) ;
	}

	@Override
	public List<Users> fechUsersList() {
		
		return (List<Users>)repo.findAll();
	}

	@Override
	public Users updateUser(Users user, Integer usersId) {
		  Users upd = repo.findById(usersId).get();
		  if(Objects.nonNull(user.getName() )&& !"". equalsIgnoreCase(upd.getName())) {
			  upd.setName(user.getName());
		
		  }
		  if(Objects.nonNull(user.getUserAddress()) && !"".equalsIgnoreCase(upd.getUserAddress())) {
			  upd.setUserAddress(user.getUserAddress());
		
		  }
		  if(Objects.nonNull(user.getUserCode()) && !"".equalsIgnoreCase(upd.getUserCode())) {
			  upd.setUserCode(user.getUserCode());
		
		
		  } 
		  
		  return repo.save(upd);
	}

	@Override
	public void deleteById(Integer usersId) {
		 repo.deleteById(usersId);;
		
	          
	}
	

}
