package com.genspark.flashcards_project.Service;

import com.genspark.flashcards_project.Entity.User;
import com.genspark.flashcards_project.DAO.UserRepository;
import com.genspark.flashcards_project.DAO.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;

@Service @Transactional @Slf4j
public class UserServiceImpl implements UserService{
  @Autowired
  public UserRepository userRepository;
  @Autowired
  public RolesRepository rolesRepository;

  public UserServiceImpl(UserRepository userRepository, RolesRepository rolesRepository) {
    this.userRepository = userRepository;
    this.rolesRepository = rolesRepository;
  }

  public UserServiceImpl(User)

  //JWOT
  @Override
  public User saveUser(User user) {
    return userRepository.save(user);
  }

  @Override
  public Role saveRole(Role role) {
    return rolesRepository.save(roles);
  }

  @Override
  public @Override
  public void addRoleToUser(String username, String roleName) {
    User user = userRepository.findByUsername(username);
    Role role = rolesRepository.findByName(roleName);
    user.getRoles().add(role);
  }

  public User getUser(String username) {
    return userRepository.findByUsername(username);
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
