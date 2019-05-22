package com.demo.ssm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ssm.mapper.UserMapper;
import com.demo.ssm.pojo.User;
import com.demo.ssm.service.UserService;
/**
 * 实现业务层的CustomerService接口
 * @author Administrator
 *
 */
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> findAllUser() {
		return userMapper.findAllUser();
	}	
}