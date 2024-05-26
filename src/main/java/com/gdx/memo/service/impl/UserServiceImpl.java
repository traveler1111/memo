package com.gdx.memo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdx.memo.entity.User;
import com.gdx.memo.mapper.UserMapper;
import com.gdx.memo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
	@Override
	public List<User> findAllUser() {
		List<User> allUser = userMapper.findAllUser();
		// TODO Auto-generated method stub
		return allUser;
	}

}
