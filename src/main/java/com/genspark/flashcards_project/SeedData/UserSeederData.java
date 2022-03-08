package com.genspark.flashcards_project.SeedData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.genspark.flashcards_project.Entity.User;
import com.genspark.flashcards_project.DAO.UserRepository;

@Component
public class UserSeederData implements CommandLineRunner {

  @Autowired
  public UserRepository userRepository;

  @Override
  public void run(String...args) throws Exception {
    loadUserData();
  }

  private void loadUserData() {
    if(userRepository.count() == 0) {
      User demoUs = new User (1,
        "Demo",
        "User",
        "DemoUser",
        "demoUser@demoEmail.io",
        "p@sswordDemo1");
      User user1 = new User(2,
        "Kendra",
        "Chauntell",
        "KChauntell",
        "kchauntell@awesome.io",
        "Kendr@89");
      userRepository.save(demoUs);
      userRepository.save(user1);
    }
  }
}
