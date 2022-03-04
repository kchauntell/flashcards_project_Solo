package com.genspark.flashcards_project.DAO;

import com.genspark.flashcards_project.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
