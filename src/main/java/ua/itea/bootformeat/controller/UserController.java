package ua.itea.bootformeat.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.itea.bootformeat.model.UserEntity;

@RequestMapping
public interface UserController {

    @PostMapping(value = {"/login"})
    ResponseEntity<UserEntity>checkUser(@RequestParam(name = "login") String login,
                                      @RequestParam (name = "password") String password);

    @PostMapping(value = {"/registration"})
    ResponseEntity<UserEntity> insertUser (@RequestBody UserEntity user);
}
