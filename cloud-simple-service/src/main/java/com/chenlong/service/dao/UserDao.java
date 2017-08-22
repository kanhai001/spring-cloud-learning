package com.chenlong.service.dao;

import com.chenlong.service.model.User;

import java.util.List;


public interface UserDao {

	List<User> findAll();
}
