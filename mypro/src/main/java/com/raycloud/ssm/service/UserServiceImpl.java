package com.raycloud.ssm.service;

import com.raycloud.ssm.mapper.UserMapper;
import com.raycloud.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tyerwetrw on 2016/3/31.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
   @Autowired
    private  UserMapper userMapper;

    public List<User> findusers() {
        return userMapper.selectByExample(null);
    }

    public int adduser(User user) {
     return   userMapper.insert(user);
    }
}
