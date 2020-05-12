package com.yzh.test;


import com.yzh.service.UserService;
import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 余中华
 * @Date: 2020/05/11/11:11
 * @Description:
 */
public class Test1 {
    @Test
    public void testaddUser(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService= (UserService) applicationContext.getBean("userServiceid");
        userService.addUser();
    }
}
