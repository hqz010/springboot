package com.hqz.springboot.service;

import com.hqz.springboot.model.User;

import java.util.List;

/***
 * 业务层接口定义
 * author:jaosn huan
 * create date:2018－6－8
 */
public interface UserService {
    List<User> findAllUser(int pageNum, int pageSize);
}
