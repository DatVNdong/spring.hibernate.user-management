package springboot.hibernate.crud.user.service;

import springboot.hibernate.crud.user.domain.Serv;

public interface ServService {

    Iterable<Serv> findAll();
}
