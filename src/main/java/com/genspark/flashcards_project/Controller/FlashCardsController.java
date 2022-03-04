package com.genspark.flashcards_project.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

import com.genspark.flashcards_project.Entity.FlashCards;
import com.genspark.flashcards_project.Service.FlashCardsService;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = { "http://localhost:3000" })
@RequestMapping("/flashcards")
public class FlashCardsController {

  @Autowired
  private FlashCardsService flashCardService;

  @GetMapping("")
  public List<FlashCards> getAllFlashCards() {
    return this.flashCardService.getAllFlashCards();
  }

  @GetMapping("/{id}")
  public Optional<FlashCards> getFlashCard(@PathVariable Long id) {
    return this.flashCardService.getFlashCard(id);
  }

  @PostMapping("")
  public FlashCards addFlashCard(@RequestBody FlashCards flashcard) {
    return this.flashCardService.addFlashCard(flashcard);
  }

  @PutMapping("")
  public FlashCards updateFlashCard(@RequestBody FlashCards flashcard) {
    return this.flashCardService.updateFlashCard(flashcard);
  }

  @DeleteMapping("/{id}")
  public String deleteFlashCard(@PathVariable Long id) {
    this.flashCardService.deleteFlashCards(id);
    return "Successfully Deleted Flashcard with ID: " + id;
  }
}
