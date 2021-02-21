package exam.exam.service;


import exam.exam.model.entity.User;
import exam.exam.model.service.UserServiceModel;

public interface UserService {
    void login(UserServiceModel user);

    UserServiceModel register(UserServiceModel userServiceModel);
    String getUserName(UserServiceModel userServiceModel);

    User findUserByName(String userName);

    UserServiceModel findUserByUsernameAndPassword(String username, String password);
}
