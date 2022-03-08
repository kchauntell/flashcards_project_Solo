package com.genspark.flashcards_project.Service;

import com.genspark.flashcards_project.Entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
  //CRUD FOR USER
  List<User> getAllUsers();
  Optional<User> getUser(Long id);
  User getUserByUsername(String username);
  User getUserByEmail(String email);
  User addUser(User user);
  User updateUser(User user);
  String deleteUser(Long id);
}
