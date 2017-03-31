package com.sean.delivery.kernel.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sean.delivery.kernel.entity.User;
import com.sean.delivery.kernel.service.IUserService;

@Controller
public class UserController {
	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Resource
	private IUserService userSerice;
	
	
	/**
	 * @Description:登录系统
	 * @param request
	 * @param response
	 * @param u
	 * @param model
	 * @return 
	 * @ReturnType:String
	 * @exception 
	 * @Since:2017年3月31日 下午4:10:56
	 * @Author:sj
	*/
	@RequestMapping("/login")
	public  String login (HttpServletRequest request,HttpServletResponse response,User u,Model model){
		logger.info("**************登录页面用户校验开始**************");
		String userCode =  request.getParameter("userCode");
		String password =  request.getParameter("password");
		
		User  user = new User();
		user.setUserCode(userCode);
		user.setPassword(password);
		
		User user1 = userSerice.getModel(user);
		
		logger.info("**************登录页面用户校验结束**************");
		
		if(user1!=null){
			return "success";
		}else{
			model.addAttribute("errorMessage", "用户名或者密码错误！");
			
			return "../../login";
		}
		
	}
	
}
