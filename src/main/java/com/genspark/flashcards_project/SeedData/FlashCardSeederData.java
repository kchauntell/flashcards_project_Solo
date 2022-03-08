package com.genspark.flashcards_project.SeedData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.genspark.flashcards_project.Entity.FlashCards;
import com.genspark.flashcards_project.DAO.FlashCardsRepository;

@Component
public class FlashCardSeederData implements CommandLineRunner{

  @Autowired
  public FlashCardsRepository flashCardsRepository;

  @Override
  public void run(String...args) throws Exception {
    loadFlashCardData();
  }

  private void loadFlashCardData() {
    if(flashCardsRepository.count() == 0) {
      FlashCards fc1 = new FlashCards(1,
        "Java",
        "When you change a value of one type to another type it is known as?",
        "Type Casting",
        "https://www.udemy.com/course/pyramid-academy/learn/quiz/4783562#overview",
        1 );
      FlashCards fc2 = new FlashCards(2,
        "Java",
        "An array is...",
        "A collection of values of the same datatype",
        "https://www.udemy.com/course/pyramid-academy/learn/quiz/4783316#overview",
        1 );
      FlashCards fc3 = new FlashCards(3,
        "Java",
        "The Java HashMap class implements what interface?",
        "The Map Interface",
        "https://www.udemy.com/course/pyramid-academy/learn/quiz/4783644#overview",
        1 );
      FlashCards fc4 = new FlashCards(4,
        "Java",
        "Method overriding is also known as?",
        "Runtime Polymorphism",
        "https://www.udemy.com/course/pyramid-academy/learn/quiz/4783546#overview",
        1 );
      FlashCards fc5 = new FlashCards(5,
        "Java",
        "What is inheritance in Java?",
        "Inheritance is the process that enables one class to acquire the properties (methods and variables) of another class.",
        "https://www.udemy.com/course/pyramid-academy/learn/quiz/4783530#overview",
        1 );
      FlashCards fc6 = new FlashCards(6,
        "Spring/SpringBoot",
        "What is Spring?",
        "The Spring framework is an application framework and inversion of control container for the Java platform. The framework's core features can be used by any Java application, but there are extensions for building web applications on top of the Java JEE platform",
        "https://www.udemy.com/course/pyramid-academy/learn/quiz/4793244#overview",
        2 );
      FlashCards fc7 = new FlashCards(7,
        "Spring/SpringBoot",
        "What is Inversion of Control?",
        "Inversion of Control is the approach to outsourcing the creation and management of objects to a factory or spring container",
        "https://www.udemy.com/course/pyramid-academy/learn/quiz/4793244#overview",
        2 );
      FlashCards fc8 = new FlashCards(8,
        "React",
        "What are expressions in JSX?",
        "An expression can be a React variable, property, or any other valid JS expression. JSX will execute the expression and return the result",
        "What are expressions in JSX?",
        2 );
      FlashCards fc9 = new FlashCards(9,
        "React",
        "How can you refer to the state object that might reside anywhere in the component?",
        "this.state.propertyName",
        "https://www.udemy.com/course/pyramid-academy/learn/quiz/4793992#overview",
        2 );
      FlashCards fc10= new FlashCards(10,
        "React",
        "What are the three phases of the component life cycle?",
        "Mounting, Updating, Unmounting",
        "https://www.udemy.com/course/pyramid-academy/learn/quiz/4793994#overview",
        2 );

      flashCardsRepository.save(fc1);
      flashCardsRepository.save(fc2);
      flashCardsRepository.save(fc3);
      flashCardsRepository.save(fc4);
      flashCardsRepository.save(fc5);
      flashCardsRepository.save(fc6);
      flashCardsRepository.save(fc7);
      flashCardsRepository.save(fc8);
      flashCardsRepository.save(fc9);
      flashCardsRepository.save(fc10);
    }
  }
}
