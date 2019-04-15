package springboot.hibernate.crud.user.service;

import springboot.hibernate.crud.user.domain.Type;

public interface TypeService {

    Iterable<Type> findAll();
}
