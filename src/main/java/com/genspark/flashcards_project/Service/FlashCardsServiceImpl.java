package com.genspark.flashcards_project.Service;

import com.genspark.flashcards_project.DAO.FlashCardsRepository;
import com.genspark.flashcards_project.Entity.FlashCards;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlashCardsServiceImpl implements FlashCardsService {
  @Autowired
  private FlashCardsRepository flashCardsRepository;

  public FlashCardsServiceImpl(FlashCardsRepository flashCardsRepository) {
    this.flashCardsRepository = flashCardsRepository;
  }

  @Override
  public List<FlashCards> getAllFlashCards() {
    return this.flashCardsRepository.findAll();
  }

  @Override
  public Optional<FlashCards> getFlashCard(Long id) {
    return this.flashCardsRepository.findById(id);
  }

  @Override
  public FlashCards addFlashCard(FlashCards flashcard) {
    return this.flashCardsRepository.save(flashcard);
  }

  @Override
  public FlashCards updateFlashCard(FlashCards flashcard) {
    Optional<FlashCards> flashCardToUpdateOptional = this.flashCardsRepository.findById(flashcard.getId());
    if (flashCardToUpdateOptional.isEmpty())
      return null;

    FlashCards flashCardToUpdate = flashCardToUpdateOptional.get();

    if (flashcard.getCourse() != null) {
      flashCardToUpdate.setCourse(flashcard.getCourse());
    }
    if (flashcard.getQuestion() != null) {
      flashCardToUpdate.setQuestion(flashcard.getQuestion());
    }
    if (flashcard.getAnswer() != null) {
      flashCardToUpdate.setAnswer(flashcard.getAnswer());
    }
    if (flashcard.getUrlLink() != null) {
      flashCardToUpdate.setUrlLink(flashcard.getUrlLink());
    }

    FlashCards flashCardUpdated = this.flashCardsRepository.save(flashCardToUpdate);
    return flashCardUpdated;
  }

  @Override
  public String deleteFlashCards(Long id) {
    Optional<FlashCards> flashCardToDeleteOptional = this.flashCardsRepository.findById(id);
    if (flashCardToDeleteOptional.isEmpty())
      return null;

    FlashCards flashCardToDelete = flashCardToDeleteOptional.get();
    this.flashCardsRepository.delete(flashCardToDelete);

    return "Sucessfully Deleted FlashCard";
  }
}
