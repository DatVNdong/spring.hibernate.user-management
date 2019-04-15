package springboot.hibernate.crud.user.repository;

import org.springframework.data.repository.CrudRepository;

import springboot.hibernate.crud.user.domain.Serv;

public interface ServiceRepository extends CrudRepository<Serv, Integer> {

}
