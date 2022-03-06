import {createStore} from 'redux';
import FlashCardDataService from '../service/FlashCardDataService';

function getAllFlashCards() {
  
}

const initialState = [];
const flashcardReducer =(state = initialState, action) => {
  switch(action.type) {
    case 'getAllFlashCards':
      let retrievedFCs = FlashCardDataService.retrieveAllFlashCards();
      return [...state, retrievedFCs]
    case 'getFlashCard':
      let retrievedCard = FlashCardDataService.retrieveFlashCard(id);
      return [...state, retrievedCard]
  }
}


//Creating store
const flashCardStore = createStore(flashcardReducer);
