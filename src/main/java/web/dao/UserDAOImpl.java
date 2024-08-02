package web.dao;

import web.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class UserDAOImpl implements UserDAO {
    private static final AtomicInteger AUTO_ID = new AtomicInteger();
    private static Map<Integer, User> users = new HashMap<>();
    static {
        User user1 = new User("Tom", 21, "Moscow");
        user1.setId(AUTO_ID.incrementAndGet());
        users.put(user1.getId(), user1);

        User user2 = new User("Alex", 22, "Moscow");
        user2.setId(AUTO_ID.incrementAndGet());
        users.put(user2.getId(), user2);

        User user3 = new User("Kate", 23, "Moscow");
        user3.setId(AUTO_ID.incrementAndGet());
        users.put(user3.getId(), user3);
    }

    @Override
    public List<User> allUsers() {
        return new ArrayList<>(users.values());
    }

    @Override
    public void add(User user) {
        user.setId(AUTO_ID.incrementAndGet());
        users.put(user.getId(), user);
    }

    @Override
    public void edit(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public void delete(int id) {
        users.remove(id);
    }

    @Override
    public User getById(int id) {
        return users.get(id);
    }
}
