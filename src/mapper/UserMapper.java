package mapper;

import po.User;

public interface UserMapper {

    User getUserByName(String username);
    User getUserById(int id);
    int insert(User user);
}