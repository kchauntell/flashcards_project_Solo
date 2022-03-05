import React, { Component } from 'react';
import UserDataService from '../../service/UserDataService';

class UserComponent extends Component {
  constructor(props) {
    super(props)
    this.state = {
      users: []
    }
  }

  componentDidMount() {
    this.refreshUserRegistry();
  }

  refreshUsers() {
    UserDataService.retrieveAllUsers()
    .then(
      response => {
        this.setState({
          users: response.data
        })
      }
    )
  }

  deleteUser(id, username) {
    UserDataService.deleteEmployee(id)
    .then(
      response => {
        this.setState({message: `Deleted User: ${username}`})
        alert(this.state.message)
        this.refreshUserRegistry();
      }
    )
  }

  updateUser
}
