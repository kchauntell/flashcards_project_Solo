import axios from 'axios';

class UserDataService {
  retrieveAllUsers() {
    return axios.get(`http://localhost:8080/api/users`);
  }

  retrieveUser(id) {
    return axios.get(`http://localhost:8080/api/users/${id}`);
  }

  addUser(user) {
    return axios.post(`http://localhost:8080/api/signup`, user);
  }

  updateUser(user) {
    return axios.put(`http://localhost:8080/api/users`, user);
  }

  deleteUser(id) {
    return axios.delete(`http://localhost:8080/api/users/${id}`)
  }

  userLogin(username, password){
    return axios.post(`http://localhost:8080/api/login`, username, password);
  }
}

export default new UserDataService();
