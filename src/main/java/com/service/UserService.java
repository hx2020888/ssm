package com.service;

import com.entity.User;

import java.util.List;

public interface UserService {
        //查询所有
        List<User> selectAll();
        //添加一条
        int addUser(User user);
        //删除一条
        int delete(Integer id);
        //修改
        int update(User user);
        //查询一条
        User selectById(Integer id);
}
