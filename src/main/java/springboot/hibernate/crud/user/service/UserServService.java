package springboot.hibernate.crud.user.service;

import java.util.List;

import springboot.hibernate.crud.user.domain.UserServ;

public interface UserServService {

    void deleteByUsername(String username);

    List<UserServ> getListUserServiceByUserName(String username);

    void save(UserServ userService);
}
