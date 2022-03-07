import  './Navigation.css';
import {NavLink} from 'react-router-dom';
import SignUpForm from '../SignUpModal'
import LoginForm from '../LoginFormModal';

function Navigation (){
  return (
    <nav id='nav-container'>
      <div id='home'>
        <button id='home-button'>
          <NavLink to='/'> Home </NavLink>
        </button>
      </div>

      <div id='login-signup-buttons'>
        <div>
          <LoginForm/>
          <SignUpForm/>
        </div>
      </div>
    </nav>
  )
}

export default Navigation;
