package com.mvcproject.test.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestBoardController {
	
	@Autowired
	private TestBoardService boardService;
	
	@RequestMapping(value="testMain.do")
	public ModelAndView main(ModelAndView modelAndView) {
		modelAndView.setViewName("miniProject/main");
		return modelAndView;
	}
	
	@RequestMapping(value="testBoardMain.do")
	public ModelAndView boardList(ModelAndView modelAndView) {
		modelAndView.setViewName("miniProject/board/boardMain");
		return modelAndView;
	}
	
	
	@RequestMapping(value="testBoardView.do")
	public ModelAndView boardView(ModelAndView modelAndView) {
		modelAndView.setViewName("miniProject/board/boardView");
		return modelAndView;
	}
	
	@RequestMapping(value="testBoardWriteForm.do")
	public ModelAndView boardWriteForm(ModelAndView modelAndView) {
		modelAndView.setViewName("miniProject/board/boardWrite");
		return modelAndView;
	}
	
	@RequestMapping(value="testBoardModify.do")
	public ModelAndView boardModify(ModelAndView modelAndView) {
		modelAndView.setViewName("miniProject/board/boardModify");
		return modelAndView;
	}
	
	@RequestMapping(value="testBoardDelete.do")
	public ModelAndView boardDelete(ModelAndView modelAndView) {
		modelAndView.setViewName("miniProject/board/boardDelete");
		return modelAndView;
	}
}
