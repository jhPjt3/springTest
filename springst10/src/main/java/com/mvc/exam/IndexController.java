package com.mvc.exam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller // 사용자의 명령을 입력 받아 매핑되는 메소드를 실행하는 클래스  mapping value가 겹치면 안 됨. 
// 메소드가 겹치면 ...
public class IndexController {

	private static final Logger logger = LoggerFactory.getLogger(IndexController.class); //logger log 출력
	
	@RequestMapping(value="/index.do", method=RequestMethod.GET)
	public ModelAndView index(ModelAndView modelAndView) {
		
		//modelandview는 데이터, view 위치를 저장하는 객체
		//model은 데이터만 저장하는 객체
		logger.debug("index 실행"); // println 대신 써주기도 함
		
		modelAndView.addObject("myMessage","spring 첫 테스트"); // setAttribute와 비슷하게 생각하면 됨
		modelAndView.setViewName("layout");
		
		return modelAndView;
		
		
	}
}
