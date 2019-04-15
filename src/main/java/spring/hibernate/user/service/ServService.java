package spring.hibernate.user.service;

import spring.hibernate.user.domain.Serv;

public interface ServService {

    Iterable<Serv> findAll();
}
