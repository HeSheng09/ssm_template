package com.project.service.impl;

import com.project.dao.IUserDao;
import com.project.entity.User;
import com.project.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * java class UserServiceImpl-
 *
 * @author HS
 * @CreateDate 2020/8/16
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    public User selectById(int id){
        return this.userDao.selectById(id);
    }
    public User selectByName(String name){
        return this.userDao.selectByName(name);
    }
}
