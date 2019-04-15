package spring.hibernate.user.service;

import spring.hibernate.user.domain.User;

public interface UserService {

    void deleteByUsername(String username);

    Iterable<User> findAll();

    User findOne(int id);

    void save(User user);
}
