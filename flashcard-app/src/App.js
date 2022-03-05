import logo from './logo.svg';
import './App.css';

import {Routes, Route} from 'react-router-dom';
import HomePage from './components/HomePage/HomePage';
import Header from './components/Header/Header';
import { BrowserRouter } from 'react-router-dom';

function App() {
  return (
    <>
    <Header />
    <Routes>
      <Route exact path='/' element={<HomePage />} />
    </Routes>
    </>
  );
}

export default App;
