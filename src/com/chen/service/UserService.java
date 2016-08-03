package com.chen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chen.dao.UserMapper;
import com.chen.domain.User;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	public User getUser()
	{
		return userMapper.selectByPrimaryKey(1);
	}

}
