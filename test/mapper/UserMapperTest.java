package mapper;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import po.User;

public class UserMapperTest {
    private ApplicationContext applicationContext;
    private UserMapper userMapper;

    @Before
    public void setUp() throws Exception {
        // 创建spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        userMapper = (UserMapper) applicationContext.getBean("userMapper");
    }


    // 根据主键查询
    @Test
    public void testGetUserById() {
        User user = userMapper.getUserById(1);
        System.out.println(user);
    }

    @Test
    public void testInsertUser(){
        User user = new User();
        user.setUsername("user0");
        user.setPassword("pswsdv");
        userMapper.insert(user);
        System.out.println(user);
    }



}
