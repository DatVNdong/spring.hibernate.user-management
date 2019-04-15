package springboot.hibernate.crud.user.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import springboot.hibernate.crud.user.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    @Transactional
    void removeByUsername(String id);
}
