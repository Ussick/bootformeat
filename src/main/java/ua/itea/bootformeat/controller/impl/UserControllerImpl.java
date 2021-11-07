package ua.itea.bootformeat.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ua.itea.bootformeat.controller.UserController;
import ua.itea.bootformeat.model.UserEntity;
import ua.itea.bootformeat.service.UserService;

@RestController
public class UserControllerImpl implements UserController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ResponseEntity<UserEntity> checkUser(String login, String password) {
        return new ResponseEntity<>(userService.checkLogin(login,password), HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<UserEntity> insertUser(UserEntity user) {
        UserEntity userEntity=userService.addUser(user);
        return new ResponseEntity<>(userEntity, HttpStatus.CREATED);
    }
}
