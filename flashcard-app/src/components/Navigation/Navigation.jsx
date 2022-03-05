import  ',/Navigation.css';
import {NavLink} from 'react-router-dom';

function Navigation (){
  return (
    <nav id='nav-container'>
      <div id='home-button'>
        <button>
          <NavLink to='/'> Home </NavLink>
        </button>
      </div>

      <div id='login-signup-buttons'>
        <div>
          <button id='login-button'>
            <NavLink to='/login'> Log In </NavLink>
          </button>
          <button id='signup-button'>
            <NavLink to='/signup'> Sign Up </NavLink>
          </button>
        </div>
      </div>
    </nav>
  )
}

export default Navigation;
