package spring.hibernate.user.service;

import java.util.List;

import spring.hibernate.user.domain.UserType;

public interface UserTypeService {

    void deleteByUsername(String username);

    List<UserType> getListUserTypeByUserName(String username);

    void save(UserType userType);
}
