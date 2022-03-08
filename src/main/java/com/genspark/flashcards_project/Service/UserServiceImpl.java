package com.genspark.flashcards_project.Service;

import com.genspark.flashcards_project.Entity.User;
import com.genspark.flashcards_project.DAO.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
  @Autowired
  public UserRepository userRepository;

  public PasswordEncoder passwordEncoder;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
    this.passwordEncoder = new BCryptPasswordEncoder(16);
  }

  @Override
  public User getUserByUsername(String username) {
    return userRepository.findByUsername(username);
  }

  @Override
  public User getUserByEmail(String email) {
    return userRepository.findByEmail(email);
  }

  //For CRUD
  @Override
  public List<User> getAllUsers() {
    return this.userRepository.findAll();
  }

  @Override
  public Optional<User> getUser(Long id) {
    return this.userRepository.findById(id);
  }

  @Override
  public User addUser(User user) {
    String encoded = this.passwordEncoder.encode(user.getHashedPassword());
    user.setPassword(encoded);
    return this.userRepository.save(user);
  }

  @Override
  public User updateUser(User user) {
    Optional<User> userToUpdateOptional = this.userRepository.findById(user.getId());
    if (userToUpdateOptional.isEmpty())
      return null;

    User userToUpdate = userToUpdateOptional.get();

    if (user.getFirstName() != null) {
      userToUpdate.setFirstName(user.getFirstName());
    }
    if (user.getLastName() != null) {
      userToUpdate.setLastName(user.getLastName());
    }
    if (user.getUsername() != null) {
      userToUpdate.setUsername(user.getUsername());
    }
    if (user.getEmail() != null) {
      userToUpdate.setEmail(user.getEmail());
    }
    if (user.getHashedPassword() != null) {
      userToUpdate.setPassword(user.getHashedPassword());
    }

    User userUpdated = this.userRepository.save(userToUpdate);
    return userUpdated;
  }

  @Override
  public String deleteUser(Long id) {
    Optional<User> userToDeleteOptional = this.userRepository.findById(id);
    if (userToDeleteOptional.isEmpty())
      return null;

    User userToDelete = userToDeleteOptional.get();
    this.userRepository.delete(userToDelete);

    return "Successfully Deleted User! THEY GOOONE!";

  }
}
