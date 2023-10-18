package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.Users;

public interface UserService {
      Users saveUser(Users user);
      List<Users> fechUsersList();
      Users updateUser(Users user , Integer usersId );
      void deleteById(Integer usersId);
}
