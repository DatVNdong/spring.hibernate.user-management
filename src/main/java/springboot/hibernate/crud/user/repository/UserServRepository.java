package springboot.hibernate.crud.user.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import springboot.hibernate.crud.user.domain.UserServ;

public interface UserServRepository extends CrudRepository<UserServ, Integer> {

    List<UserServ> findByUsername(String username);

    @Transactional
    void removeByUsername(String username);
}
