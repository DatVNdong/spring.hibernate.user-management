package springboot.hibernate.crud.user.service;

import springboot.hibernate.crud.user.domain.User;

public interface UserService {

    void deleteByUsername(String username);

    Iterable<User> findAll();

    User findOne(int id);

    void save(User user);
}
