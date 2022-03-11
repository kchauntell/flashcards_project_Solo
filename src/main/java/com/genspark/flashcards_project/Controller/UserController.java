package com.genspark.flashcards_project.Controller;

import com.genspark.flashcards_project.DAO.UserRepository;
import com.genspark.flashcards_project.Entity.User;
import com.genspark.flashcards_project.Entity.Status;
import com.genspark.flashcards_project.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;

@RestController
@CrossOrigin(origins = { "http://localhost:3000" })
@RequestMapping("/api")
public class UserController {
  @Autowired
  public UserService userService;

  @Autowired
  UserRepository userRepository;

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

  //Register the user
  @PostMapping("/users/register")
  public Status registerUser(@Valid @RequestBody User newUser) {
    List<User> users = userRepository.findAll();

    for (User user : users) {
      if(user.equals(newUser)) {
        System.out.println("USER ALREADY EXISTS!");
        return Status.USER_ALREADY_EXISTS;
      }
    }
    userRepository.save(newUser);
    return Status.SUCCESS;
  }

  // Setting up for Login
  @PostMapping("/users/login")
  public Status loginUser(@Valid @RequestBody User user) {
    List<User> users = userRepository.findAll();

    for(User other : users) {
      if(other.equals(user)) {
        user.setIsLoggedIn(true);
        userRepository.save(user);
        return Status.SUCCESS;
      }
    }
    return Status.FAILURE;
  }

  //Logout user
  @PostMapping("users/logout")
  public Status logUserOut(@Valid @RequestBody User user) {
    List<User> users = userRepository.findAll();

    for(User other : users) {
      if(other.equals(user)) {
        user.setIsLoggedIn(false);
        userRepository.save(user);
        return Status.SUCCESS;
      }
    }
    return Status.FAILURE;
  }
}
