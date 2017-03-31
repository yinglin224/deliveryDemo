package com.sean.delivery.kernel.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sean.delivery.kernel.dao.UserMapper;
import com.sean.delivery.kernel.entity.User;
import com.sean.delivery.kernel.service.IUserService;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User, UserMapper> implements IUserService {

	@Resource
	private UserMapper userMapper;
	
	@Autowired
	public void setBaseMapper(){
		super.setBaseMapper(userMapper);
	} 
	

	
	
	
}

