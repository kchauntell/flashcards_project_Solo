import './HomePage.css';
import FlashCardDataService from '../../service/FlashCardDataService';
import { useState, useEffect } from 'react';

function HomePage() {
  const [allFlashcards, setAllFlashCards] = useState([]);

  const flashCardsToDisplay = async () => {
    try {
      const allFlashcardData = await FlashCardDataService.retrieveAllFlashCards();
      setAllFlashCards(allFlashcardData.data);
    } catch (err) {
      console.log(err);
    }
  }
  console.log(allFlashcards);

  useEffect(() => {
    flashCardsToDisplay();
  }, []);

  const topics = new Set();

  allFlashcards.map((card) => {
    topics.add(card.course);
  });
  let arrTopics = [...topics];


  return (
    <div id='homepage-container'>
      <h1> Let's Get Started!</h1>
      <h2> Let's Explore Public Decks Users Have Already Created!</h2>
      <div>
        {arrTopics.map((topic) => {
          return (
            <div key={topic}>
              <div>
                <h3 id='topic'>{topic}</h3>
              </div>
              {allFlashcards.map((card) => {
                if (topic === card.course) {
                  return (
                    <div key={card.id} id='cards-container'>
                      <div id='front'> Question?
                        <div id='card-question'>
                          {card.question}
                        </div>
                      </div>
                    </div>
                  )
                }
              })}
            </div>
          )
        })}
      </div>
    </div>
  )
}

export default HomePage;
