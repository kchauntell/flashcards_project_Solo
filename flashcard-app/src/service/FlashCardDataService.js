import axios from 'axios';

class FlashCardDataService {

  retrieveAllFlashCards = () => {
    return axios.get(`http://localhost:8080/flashcards`)
  }
  retrieveFlashCard(id) {
    return axios.get(`http://localhost:8080/flashcards/${id}`)

  }
  addFlashCard(flashcard) {
    return axios.post(`http://localhost:8080/flashcards`, flashcard)
  }
  updateFlashCard(flashcard) {
    return axios.put(`http://localhost:8080/flashcards`, flashcard)
  }
  deleteFlashCard(id) {
    return axios.delete(`http://localhost:8080/flashcards/${id}`)
  }
}

export default new FlashCardDataService();
