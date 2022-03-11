import './HomePage.css';
import FlashCardDataService from '../../service/FlashCardDataService';
import { useState, useEffect} from 'react';


function HomePage() {
  const [allFlashcards, setAllFlashCards] = useState([]);

  const flashCardsToDisplay = async() => {
    try {
      const allFlashcardData = await FlashCardDataService.retrieveAllFlashCards();
      setAllFlashCards(allFlashcardData.data);
    } catch (err) {
      console.log(err);
    }
  }

  useEffect(() => {
    flashCardsToDisplay();
  }, []);

  // console.log(allFlashcards);


  return (
    <div id='homepage-container'>
      <h1> Let's Get Started!</h1>
      <h2> Let's Explore Public Decks Users Have Already Created!</h2>
    </div>
  )
}

export default HomePage;
