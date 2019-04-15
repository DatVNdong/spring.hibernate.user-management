package spring.hibernate.user.service;

import spring.hibernate.user.domain.Type;

public interface TypeService {

    Iterable<Type> findAll();
}
