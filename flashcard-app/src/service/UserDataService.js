import axios from 'axios';

class UserDataService {
  retrieveAllUsers() {
    return axios.get(`http://localhost:8080/users`);
  }

  retrieveUser(id) {
    return axios.get(`http://localhost:8080/users/${id}`);
  }

  addUser(user) {
    return axios.post(`http://localhost:8080/users`, user);
  }

  updateUser(user) {
    return axios.put(`http://localhost:8080/users`, user);
  }

  deleteUser(id) {
    return axios.delete(`http://localhost:8080/users/${id}`)
  }
}

export default new UserDataService();
