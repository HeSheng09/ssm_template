package com.project.service;

import com.project.entity.User;

public interface IUserService {
    public User selectById(int id);
    public User selectByName(String name);
}
