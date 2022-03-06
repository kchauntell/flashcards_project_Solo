package com.genspark.flashcards_project.Entity;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
  @Id
  // @Column(name="ID")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "FIRST_NAME", nullable=false)
  private String firstName;

  @Column(name = "LAST_NAME", nullable=false)
  private String lastName;

  @Column(name = "USER_NAME", nullable=false, unique = true)
  private String username;

  @Column(name = "EMAIL", nullable=false, unique = true)
  private String email;

  @Column(name = "HASHED_PASSWORD", nullable=false)
  private String hashedPassword;

  // Constructor
  public User() {
  }

  public User(long id, String firstName, String lastName, String username, String email, String hashedPassword) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.email = email;
    this.hashedPassword = hashedPassword;
  }

  // Getters and Setters
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getHashedPassword() {
    return hashedPassword;
  }

  public void setPassword(String hashedPassword) {
    this.hashedPassword = hashedPassword;
  }



  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", username='" + username + '\'' +
        ", email='" + email + '\'' +
        ", hashedPassword='" + hashedPassword + '\'' +
        '}';
  }
}
