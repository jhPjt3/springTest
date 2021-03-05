package com.mvc.exam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageController {

	private static final Logger logger = LoggerFactory.getLogger(MessageController.class);
	
	@RequestMapping(value="/message.do", method=RequestMethod.GET)
	public ModelAndView Message(ModelAndView modelAndView) {
		logger.debug("message 실행");
		
		modelAndView.addObject("홍길동");
		modelAndView.setViewName("message");
		
		return modelAndView;
	}
}
