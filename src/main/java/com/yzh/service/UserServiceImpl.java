package com.yzh.service;

import com.yzh.dao.UserDao;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 余中华
 * @Date: 2020/05/11/11:10
 * @Description:
 */
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    @Override
    public void addUser() {
        System.out.println("add user");
    }
}
