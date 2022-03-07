import './App.css';

import {Routes, Route} from 'react-router-dom';
import HomePage from './components/HomePage/HomePage';
import Header from './components/Header/Header';
import Footer from './components/Footer/Footer';

function App() {
  return (
    <>
    <Header />
      <Routes>
        <Route exact path='/' element={<HomePage />} />
      </Routes>
    <Footer />
    </>
  );
}

export default App;
