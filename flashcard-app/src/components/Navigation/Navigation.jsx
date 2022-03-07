import  './Navigation.css';
import {NavLink} from 'react-router-dom';
import SignUpForm from '../SignUpModal'

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
          <button id='login-button'>
            <NavLink to='/login'> Log In </NavLink>
          </button>
          <SignUpForm id='signup-button'/>
        </div>
      </div>
    </nav>
  )
}

export default Navigation;
