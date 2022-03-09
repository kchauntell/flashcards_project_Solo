import './HomePage.css';
import FlashCardDataService from '../../service/FlashCardDataService';
import {useState} from 'react-router-dom';


function HomePage() {


  return (
    <div id='homepage-container'>
      <h1> Let's Get Started!</h1>
      <h2> Let's Explore Public Decks Users Have Already Created!</h2>
      <div id= 'homepage-columns'>
        <div id='left-navigation'>Decks/Flashcards</div>
        <div id='body'> Where flash cards will appear</div>
        <div id='rightColumn'> where results of answers will go</div>
      </div>
    </div>
  )
}

export default HomePage;
