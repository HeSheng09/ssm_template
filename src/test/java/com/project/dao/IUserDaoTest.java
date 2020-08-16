package com.project.dao;

import com.project.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {
    @Resource
    private IUserDao iUserDao;
    @Test
    public void selectById() {
        User user=iUserDao.selectById(1);
        System.out.println(user);
    }
}