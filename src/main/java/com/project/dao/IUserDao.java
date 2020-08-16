package com.project.dao;

import com.project.entity.User;

public interface IUserDao {
    public User selectById(int id);
    public User selectByName(String name);
}
