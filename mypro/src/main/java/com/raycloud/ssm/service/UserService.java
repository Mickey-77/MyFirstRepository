package com.raycloud.ssm.service;

import com.raycloud.ssm.pojo.User;

import java.util.List;

/**
 * Created by tyerwetrw on 2016/3/31.
 */
public interface  UserService {
    public List<User> findusers();
    public int adduser(User user);
}
