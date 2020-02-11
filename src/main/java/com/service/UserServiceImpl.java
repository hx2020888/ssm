package com.service;

import com.entity.User;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> selectAll() {
        List<User> users = userMapper.selectAll();
        return users;
    }

    @Override
    public int addUser(User user) {
        int i = userMapper.addUser(user);
        return i;
    }

    @Override
    public int delete(Integer id) {
        int i = userMapper.delete(id);
        return i;
    }

    @Override
    public int update(User user) {
        int i = userMapper.update(user);
        return i;
    }

    @Override
    public User selectById(Integer id) {
        User user = userMapper.selectById(id);
        return user;
    }
}
