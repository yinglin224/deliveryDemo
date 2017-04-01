package com.sean.delivery.kernel.shiro;


import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.sean.delivery.kernel.entity.User;
import com.sean.delivery.kernel.service.IUserService;


public class DsRealm extends AuthorizingRealm {

	@Resource
	private IUserService userService;
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		System.out.println("进入权限+++doGetAuthorizationInfo");
		return null;
	}

	@Override
	//验证当前登录的Subject
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		
		//获取基于用户名和密码的令牌  
        //实际上这个token是从LoginController里面subject.login(token)传过来的  
        //两个token的引用都是一样的
		UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
		String username = usernamePasswordToken.getUsername();
		
		User user = new User();
		user.setUserCode(username);
		User user1 = userService.getModel(user);
		
		if (user1 == null) {
			// 用户名不存在
			return null;
		}
		
		// 返回携带密码对象
		// 第一个参数 ，在subject获取参数，可以存任何东西
		// 第二步参数 ，查询数据库密码 ， 返回后 shiro 会去用token 中密码比较
		return new SimpleAuthenticationInfo(user1, user1.getPassword(), getName());
	}

}
