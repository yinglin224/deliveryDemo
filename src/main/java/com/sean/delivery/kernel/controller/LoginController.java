package com.sean.delivery.kernel.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sean.delivery.kernel.entity.User;
import com.sean.delivery.kernel.service.IUserService;

@Controller
public class LoginController extends BaseController {
	
	@Resource
	private IUserService userService;
	
	
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
	@RequestMapping("/login1")
	public  String login (HttpServletRequest request,HttpServletResponse response,User u,Model model){
		logger.info("**************登录页面用户校验开始**************");
		String userCode =  request.getParameter("userCode");
		String password =  request.getParameter("password");
		
		User  user = new User();
		user.setUserCode(userCode);
		user.setPassword(password);
		
		User user1 = userService.getModel(user);
		
		logger.info("**************登录页面用户校验结束**************");
		
		if(user1!=null){
			return "success";
		}else{
			model.addAttribute("errorMsg", "用户名或者密码错误！");
			
			return "../../login";
		}
		
	}
	
	/**
	 * @Description:引入shiro机制
	 * @param request
	 * @param response
	 * @param user
	 * @param model
	 * @return 
	 * @throws IOException 
	 * @ReturnType:String
	 * @exception 
	 * @Since:2017年4月1日 下午2:43:35
	 * @Author:sj
	*/
	@RequestMapping("/logout")
	public  String login1 (HttpServletRequest request,HttpServletResponse response,HttpSession session,User user,Model model) throws IOException{
		logger.info("**************shiro登录页面用户校验开始**************");
		UsernamePasswordToken token = new UsernamePasswordToken(user.getUserCode(), user.getUserName());
		Subject subject = SecurityUtils.getSubject();
		
		
		try {
			subject.login(token);
			User u = (User) subject.getPrincipal();
			// 登录成功，向session存放当前用户
			session.setAttribute("currUser", u);
			
		} catch (AuthenticationException e) {
			model.addAttribute("errorMsg", "用户名或密码错误");
			return "../../login";
		}
		
		String contextPath = request.getContextPath();
		response.sendRedirect(contextPath);
		return null;
	}
	
}
