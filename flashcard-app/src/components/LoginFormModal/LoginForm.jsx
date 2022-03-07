import './LoginForm.css';
import React, { useState } from 'react';

// Don't forget about dispatch for this
//working to get the login area set up. Then refactor with functionality

function LoginForm () {

  const [credential, setCredential] = useState('');
  const [password, setPassword] = useState('');
  const [errors, setError] = useState([])

  return (
    <form id='loginForm'> LOG IN HERE!
      <div>
        <h3>Try Demo Mode!</h3>
        <button
          id='demoButton'
          onClick={() => { setCredential('DemoUs'); setPassword('p@sswordDemo1')}}
          type='submit'> Demo User</button>
      </div>
      <div id='loginModal'>
        <div id='login-name'>
          <label>
            Username-OR-Email:
            <input
              type='text'
              value={credential}
              onChange={(e) => setCredential(e.target.value)}
              required
            />
          </label>
        </div>
        <div id='login-password'>
          <label>
            Password:
            <input
              type='password'
              value={password}
              onChange={(e) => setPassword(e.target.value)}
              required
            />
          </label>
        </div>
        <div>
          <button type='submit'>Log In</button>
        </div>
      </div>
    </form>
  )
}

export default LoginForm;
