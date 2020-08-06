package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.api.FakeApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: Done

    public UserRepository(ApiService apiService) {

        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // TODO: Done

        return apiService.getUsers();
    }

    public void generateRandomUser() {
        // TODO: Done
        apiService.generateRandomUser();
    }

    public void deleteUser(User username) {
        // TODO: Done
        apiService.deleteUser(username);
    }
}
