package ua.itea.bootformeat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.itea.bootformeat.model.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {

    UserEntity checkUser(String login, String password);
}
