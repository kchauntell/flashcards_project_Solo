package com.genspark.flashcards_project.Service;

import com.genspark.flashcards_project.Entity.FlashCards;

import java.util.List;
import java.util.Optional;

public interface FlashCardsService {
  List<FlashCards> getAllFlashCards();

  Optional<FlashCards> getFlashCard(Long id);

  FlashCards addFlashCard(FlashCards flashcard);

  FlashCards updateFlashCard(FlashCards flashcard);

  String deleteFlashCards(Long id);
}
