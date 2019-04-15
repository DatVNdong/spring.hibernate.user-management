package springboot.hibernate.crud.user.service;

import java.util.List;

import springboot.hibernate.crud.user.domain.UserType;

public interface UserTypeService {

    void deleteByUsername(String username);

    List<UserType> getListUserTypeByUserName(String username);

    void save(UserType userType);
}
