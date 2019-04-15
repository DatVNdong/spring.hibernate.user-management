package spring.hibernate.user.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import spring.hibernate.user.domain.UserServ;

public interface UserServRepository extends CrudRepository<UserServ, Integer> {

    List<UserServ> findByUsername(String username);

    @Transactional
    void removeByUsername(String username);
}
