package cn.iocoder.springboot.lab49.lombokdemo.service;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserService01Test {

    private UserService01 userService01 = new UserService01();

    @Test
    public void test02() {
        userService01.test02(null, null);
    }

}
