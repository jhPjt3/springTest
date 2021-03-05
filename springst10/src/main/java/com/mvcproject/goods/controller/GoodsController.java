package com.mvcproject.goods.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mvcproject.goods.controller.model.vo.Goods;
import com.mvcproject.goods.controller.service.GoodsService;

@Controller
public class GoodsController {
	
	@Autowired
	GoodsService goodsService;
	
	@RequestMapping(value="goodsList.do", method=RequestMethod.GET)
	public ModelAndView goodsList(ModelAndView modelAndView, HttpServletRequest request) throws Exception {
		
		List<Goods> goodsList = goodsService.selectGoodsAll();
		modelAndView.addObject("goodsList", goodsList);
		modelAndView.setViewName("goods/goodsList");
		return modelAndView;
	}
	
	@RequestMapping(value="goodsView.do", method=RequestMethod.GET)
	public String goodsViewService(@RequestParam("code")String code,Model model, HttpServletRequest request)
					throws Exception {
		Goods goods = goodsService.selectGoods(code);
		model.addAttribute("goods",goods);
		return "goods/goodsView";
	}
	
	@RequestMapping(value="goodsInsert.do", method=RequestMethod.GET)
	public ModelAndView insertGoods(Goods goods, ModelAndView modelAndView) throws Exception {
		
		int cnt = goodsService.insertGoods(goods);
		modelAndView.addObject("cnt",cnt);
		modelAndView.setViewName("goods/goodsInsertComplete");
		
		return modelAndView;
	}
	
	@RequestMapping(value="goodsForm.do", method=RequestMethod.GET)
	public ModelAndView goodsForm(Goods goods, ModelAndView modelAndView) throws Exception {
		
		modelAndView.setViewName("goods/goodsInsert");
		return modelAndView;
	}
	
	@RequestMapping(value="goodsDelete.do", method=RequestMethod.GET)
	public ModelAndView deleteGoods(Goods goods, ModelAndView modelAndView) throws Exception {
		
		int cnt = goodsService.deleteGoods(goods);
		
		modelAndView.addObject("cnt",cnt);
		modelAndView.setViewName("goods/goodsDeleteComplete");
		return modelAndView;
	}
	
	@RequestMapping(value="goodsUpt.do", method=RequestMethod.GET)
	public ModelAndView updateGoods(Goods goods, ModelAndView modelAndView) throws Exception {
		int cnt = goodsService.updateGoods(goods);
		modelAndView.addObject("cnt", cnt);
		modelAndView.setViewName("goods/goodsUpdateComplete");
		
		return modelAndView;
	}
}
