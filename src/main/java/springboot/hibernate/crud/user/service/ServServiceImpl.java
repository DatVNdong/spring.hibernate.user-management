package springboot.hibernate.crud.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.hibernate.crud.user.domain.Serv;
import springboot.hibernate.crud.user.repository.ServiceRepository;

@Service
public class ServServiceImpl implements ServService {
    
    @Autowired
    private ServiceRepository serviceRepository;
    
    @Override
    public Iterable<Serv> findAll() {
        return serviceRepository.findAll();
    }
}
