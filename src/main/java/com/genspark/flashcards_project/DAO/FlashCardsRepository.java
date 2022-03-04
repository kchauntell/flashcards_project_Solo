package com.genspark.flashcards_project.DAO;

import com.genspark.flashcards_project.Entity.FlashCards;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlashCardsRepository extends JpaRepository<FlashCards, Long> {
}
