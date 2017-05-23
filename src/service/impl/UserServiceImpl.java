package service.impl;

import mapper.UserMapper;
import org.springframework.stereotype.Service;
import po.User;
import service.UserService;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    /* 登陆验证 */
    public User checkLogin(String username, String password) {
        //根据用户名实例化用户对象
        User user = userMapper.getUserByName(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }


}