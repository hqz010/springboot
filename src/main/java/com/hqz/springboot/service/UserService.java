package com.hqz.springboot.service;

import com.hqz.springboot.model.User;

import java.util.List;

/**
 * create by jason huang
 */
public interface UserService {
    List<User> findAllUser(int pageNum, int pageSize);
}
