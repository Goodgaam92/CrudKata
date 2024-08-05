package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void add(User user);

    void edit(User user);

    void delete(int id);

    User getById(int id);

}
