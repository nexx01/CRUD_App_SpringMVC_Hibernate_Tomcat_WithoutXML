package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;


public interface UserDao {

    User saveUser(User user);

    void delete(User User);

    List<User> getAllUsers();

    void cleanUsersTable();

    User findUserbyId(Long Id);
}
