package springboot.hibernate.crud.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.hibernate.crud.user.domain.UserType;
import springboot.hibernate.crud.user.repository.UserTypeRepository;

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
