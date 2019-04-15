package springboot.hibernate.crud.user.repository;

import org.springframework.data.repository.CrudRepository;

import springboot.hibernate.crud.user.domain.Type;

public interface TypeRepository extends CrudRepository<Type, Integer> {

}
