package hiber.service;

import hiber.model.User;
import org.hibernate.query.Query;


import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    List<User> getUserByCar(String model, int series);
}
