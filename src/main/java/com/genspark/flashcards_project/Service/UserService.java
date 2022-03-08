package com.genspark.flashcards_project.Service;

import com.genspark.flashcards_project.Entity.User;
import com.genspark.flashcards_project.Entity.Role;

import java.util.List;
import java.util.Optional;

public interface UserService {
  //Deals with JWOT 
  User saveUser(User user);
  Role saveRole(Role role);
  void addRoleToUser(String username, String roleName);

  //CRUD FOR USER
  List<User> getAllUsers();
  Optional<User> getUser(Long id);
  User addUser(User user);
  User updateUser(User user);
  String deleteUser(Long id);
}
