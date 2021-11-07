package ua.itea.bootformeat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import ua.itea.bootformeat.model.UserEntity;
import ua.itea.bootformeat.repository.UserRepository;
import ua.itea.bootformeat.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity checkLogin(String login, String password) {
        if (userRepository.checkUser(login, password) != null) {
            return userRepository.checkUser(login, password);
        } else
            return new UserEntity();
    }

    @Override
    public UserEntity addUser(UserEntity user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(0);
        try {
            userEntity = userRepository.save(user);
        } catch (DataIntegrityViolationException exception) {
            System.out.println(exception.getMessage());
        } finally {
            return userEntity;
        }
    }
}
