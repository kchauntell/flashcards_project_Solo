package com.genspark.flashcards_project.Controller;

import com.genspark.flashcards_project.Entity.User;
import com.genspark.flashcards_project.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = { "http://localhost:3000" })
@RequestMapping("/api")
public class UserController {
  @Autowired
  public UserService userService;

  @GetMapping("/users")
  public List<User> getAllUsers() {
    return this.userService.getAllUsers();
  }

  @GetMapping("/users/{id}")
  public Optional<User> getUser(@PathVariable Long id) {
    return this.userService.getUser(id);
  }

  @PostMapping("/users")
  public User addUser(@RequestBody User user) {
    return this.userService.addUser(user);
  }

  @PutMapping("/users")
  public User updateUser(@RequestBody User user) {
    return this.userService.updateUser(user);
  }

  @DeleteMapping("/users/{id}")
  public String deleteUser(@PathVariable Long id) {
    this.userService.deleteUser(id);
    return "Successfully Deleted User with ID: " + id;
  }
}
