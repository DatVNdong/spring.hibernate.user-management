package spring.hibernate.user.service;

import java.util.List;

import spring.hibernate.user.domain.UserServ;

public interface UserServService {

    void deleteByUsername(String username);

    List<UserServ> getListUserServiceByUserName(String username);

    void save(UserServ userService);
}
