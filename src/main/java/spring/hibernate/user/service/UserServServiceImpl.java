package spring.hibernate.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.hibernate.user.domain.UserServ;
import spring.hibernate.user.repository.UserServRepository;

@Service
public class UserServServiceImpl implements UserServService {

    @Autowired
    private UserServRepository userServRepository;

    @Override
    public void deleteByUsername(String username) {
        userServRepository.removeByUsername(username);
    }

    @Override
    public List<UserServ> getListUserServiceByUserName(String username) {
        return userServRepository.findByUsername(username);
    }

    @Override
    public void save(UserServ userService) {
        userServRepository.save(userService);
    }
}
