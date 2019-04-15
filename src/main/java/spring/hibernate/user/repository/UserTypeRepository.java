package spring.hibernate.user.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import spring.hibernate.user.domain.UserType;

public interface UserTypeRepository extends CrudRepository<UserType, Integer> {

    List<UserType> findByUsername(String username);

    @Transactional
    void removeByUsername(String username);
}
