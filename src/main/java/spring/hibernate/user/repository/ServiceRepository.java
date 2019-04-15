package spring.hibernate.user.repository;

import org.springframework.data.repository.CrudRepository;

import spring.hibernate.user.domain.Serv;

public interface ServiceRepository extends CrudRepository<Serv, Integer> {

}
