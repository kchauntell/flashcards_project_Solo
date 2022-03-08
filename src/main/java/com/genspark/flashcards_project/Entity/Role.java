package com.genspark.flashcards_project.Entity;

import javax.persistence.*;


@Entity
@Table(name="ROLES")
public class Role {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;

  //No Args Constructor
  public Role () {}

  //Args Constructor
  public Role (Long id, String name) {
    this.id = id;
    this.name=name;
  }

  //Getters and Setters
  public Long getId () {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
}
