package spring.hibernate.user.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import spring.hibernate.user.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    @Transactional
    void removeByUsername(String id);
}
