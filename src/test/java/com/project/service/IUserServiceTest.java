package com.project.service;

import com.project.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserServiceTest {
    @Resource
    private IUserService iUserService;

    @Test
    public void selectById() {
        User user=iUserService.selectById(1);
        if(user == null){
            System.out.println("查无此人");
        }else{
            System.out.println(user);
        }
    }
}