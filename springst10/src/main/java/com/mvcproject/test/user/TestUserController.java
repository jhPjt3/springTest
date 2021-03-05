package com.mvcproject.test.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestUserController {
	@Autowired
	private TestUserService userService;
	
	@RequestMapping(value="testLogin.do")
	public ModelAndView login(ModelAndView modelAndView) {
		modelAndView.setViewName("miniProject/user/login");
		return modelAndView;
	}
	
	@RequestMapping(value="testLogout.do")
	public ModelAndView logout(ModelAndView modelAndView) {
		modelAndView.setViewName("miniProject/user/logout");
		return modelAndView;
	}
	
	@RequestMapping(value="testJoin.do")
	public ModelAndView join(ModelAndView modelAndView) {
		modelAndView.setViewName("miniProject/user/join");
		return modelAndView;
	}
	
	@RequestMapping(value="testModify.do")
	public ModelAndView modify(ModelAndView modelAndView) {
		modelAndView.setViewName("miniProject/user/modify");
		return modelAndView;
	}
}
