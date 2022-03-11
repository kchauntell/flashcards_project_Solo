import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { ModalProvider } from './context/Modal';
import Header from './components/Header/Header';
import Footer from './components/Footer/Footer';

import {BrowserRouter} from 'react-router-dom';

function Root() {
  return (
    <ModalProvider>
      <BrowserRouter>
        <App />
      </BrowserRouter>
    </ModalProvider>
  )
}

ReactDOM.render(
  <React.StrictMode>
    <Root />
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
