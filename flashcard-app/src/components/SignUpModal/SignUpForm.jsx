import './SignUpForm.css';
import React, { useState, useEffect } from 'react';
import { useNavigate } from 'react-router-dom';
import UserDataService from '../../service/UserDataService';

//come back and add dispatch portions for getting everything to be functional.

function SignUpForm() {
  const [firstName, setFirstName] = useState('');
  const [lastName, setLastName] = useState('');
  const [username, setUsername] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [confirmPassword, setConfirmPassword] = useState('');
  const navigate = useNavigate();

  const handleSubmit = (e) => {
    e.preventDefault();
    if (password === confirmPassword) {
      UserDataService.addUser({
        firstName,
        lastName,
        username,
        email,
        password,
      });
      return navigate('/');
    } else {
      return "Passwords Do Not Match"
    }
  }

  return (
    <form id='SignUpForm' onSubmit={handleSubmit}>
      <div id='SignUpModal'>
        <div>
          <label>
            First Name:
            <input
              type="text"
              value={firstName}
              onChange={(e) => setFirstName(e.target.value)}
              required
            />
          </label>
        </div>
        <div>
          <label>
            Last Name:
            <input
              type="text"
              value={lastName}
              onChange={(e) => setLastName(e.target.value)}
              required
            />
          </label>
        </div>
        <div>
          <label>
            Email:
            <input
              type="text"
              value={email}
              onChange={(e) => setEmail(e.target.value)}
              required
            />
          </label>
        </div>
        <div>
          <label>
            Username:
            <input
              type="text"
              value={username}
              onChange={(e) => setUsername(e.target.value)}
              required
            />
          </label>
        </div>
        <div>
          <label>
            Password:
            <input
              type="password"
              value={password}
              onChange={(e) => setPassword(e.target.value)}
              required
            />
          </label>
        </div>
        <div>
          <label>
            Confirm Password:
            <input
              type="password"
              value={confirmPassword}
              onChange={(e) => setConfirmPassword(e.target.value)}
              required
            />
          </label>
        </div>
        <div id='SignupButtonDiv'>
          <button
            type="submit">Sign Up</button>
        </div>
      </div>
    </form>
  )
}

export default SignUpForm;
