package com.hqz.springboot.service;

import com.hqz.springboot.model.User;

import java.util.List;

public interface UserService {
    List<User> findAllUser(int pageNum, int pageSize);
}
