package spring.hibernate.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.hibernate.user.domain.Serv;
import spring.hibernate.user.repository.ServiceRepository;

@Service
public class ServServiceImpl implements ServService {
    
    @Autowired
    private ServiceRepository serviceRepository;
    
    @Override
    public Iterable<Serv> findAll() {
        return serviceRepository.findAll();
    }
}
