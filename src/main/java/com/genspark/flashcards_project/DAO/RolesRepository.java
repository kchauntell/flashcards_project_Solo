package com.genspark.flashcards_project.DAO;

import com.genspark.flashcards_project.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<Role, Long>{
  Role findByName(String name);
}
