package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.api.FakeApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {

        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // TODO:  je comprend rien comment ca marche ses magique

        return apiService.getUsers();
    }

    public void generateRandomUser() {
        // TODO: A modifier yolo je ne sais pas ou se trouve la seconde liste static
        apiService.generateRandomUser();
    }

    public void deleteUser(User username) {
        // TODO: huston ?? comment je modif une fause liste static
        apiService.deleteUser(username);
    }
}
