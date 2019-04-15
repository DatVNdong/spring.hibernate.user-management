package spring.hibernate.user.repository;

import org.springframework.data.repository.CrudRepository;

import spring.hibernate.user.domain.Type;

public interface TypeRepository extends CrudRepository<Type, Integer> {

}
