package spring.hibernate.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.hibernate.user.domain.UserType;
import spring.hibernate.user.repository.UserTypeRepository;

@Service
public class UserTypeServiceImpl implements UserTypeService {

    @Autowired
    private UserTypeRepository userTypeRepository;

    @Override
    public void deleteByUsername(String username) {
        userTypeRepository.removeByUsername(username);
    }

    @Override
    public List<UserType> getListUserTypeByUserName(String username) {
        return userTypeRepository.findByUsername(username);
    }

    @Override
    public void save(UserType userType) {
        userTypeRepository.save(userType);
    }
}
