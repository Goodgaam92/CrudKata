package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> allUsers();

    void add(User user);

    void edit(User user);

    void delete(int id);

    User getById(int id);

}
