package com.mapper;

import com.entity.User;

import java.util.List;

public interface UserMapper {
    //查询所有
    public List<User> selectAll();
    //添加一条
    public int addUser(User user);
    //删除一条
    public int delete(Integer id);
    //修改
    public int update(User user);
    //查询一条
    public User selectById(Integer id);
}
