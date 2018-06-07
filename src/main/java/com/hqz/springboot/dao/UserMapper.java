package com.hqz.springboot.dao;

import com.hqz.springboot.model.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String userAccount);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userAccount);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //这个方式我自己加的
    List<User> selectAllUser();
}