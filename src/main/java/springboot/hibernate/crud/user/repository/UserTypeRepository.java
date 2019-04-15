package springboot.hibernate.crud.user.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import springboot.hibernate.crud.user.domain.UserType;

public interface UserTypeRepository extends CrudRepository<UserType, Integer> {

    List<UserType> findByUsername(String username);

    @Transactional
    void removeByUsername(String username);
}
