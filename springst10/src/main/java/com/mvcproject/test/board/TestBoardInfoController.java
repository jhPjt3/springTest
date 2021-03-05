package com.mvcproject.test.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestBoardInfoController {

	@Autowired
	TestBoardInfoService testBoardInfoService;
	
	@RequestMapping(value="testBoardInfo.do")
	public ModelAndView boardInfoList(ModelAndView modelAndView) throws Exception {
		List<TestBoardInfo> topMenuList = testBoardInfoService.getTopMenuList();
		modelAndView.setViewName("miniProject/board/include/top_menu");
		return modelAndView;
	}
}
