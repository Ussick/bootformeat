package ua.itea.bootformeat.service;

import ua.itea.bootformeat.model.UserEntity;

public interface UserService {
    UserEntity checkLogin(String login, String password);
    UserEntity addUser(UserEntity user);
}
