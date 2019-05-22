package com.demo.ssm.service;

import java.util.List;

import com.demo.ssm.pojo.User;
/**
 * 定义业务层接口
 * @author Administrator
 *
 */
public interface UserService {
	List<User> findAllUser(); //查询所有用户信息
}