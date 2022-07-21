package com.spring.mvc.dynamicQuery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.dynamicQuery.dao.DynamicQueryDao;

@Controller
@RequestMapping("/dynamicQuery")
public class DynamicQueryController {
	
	@Autowired
	private DynamicQueryDao dynamciQueryDao;
	
	@RequestMapping(value = "/list", method=RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("dynamicQuery/dynamicQueryList");
		mv.addObject("orderMapList", dynamciQueryDao.selectOrderList());
		
		return mv;
	}
	
	@RequestMapping(value = "/ifEx", method=RequestMethod.GET)
	public ModelAndView ifEx() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("dynamicQuery/dynamicQueryList");
		mv.addObject("orderMapList", "-");
		
		return mv;
	}
	
	@RequestMapping(value = "/chooseEx01", method=RequestMethod.GET)
	public ModelAndView chooseEx01() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("dynamicQuery/dynamicQueryList");
		mv.addObject("orderMapList", "-");
		
		return mv;
	}
	
	@RequestMapping(value = "/chooseEx02", method=RequestMethod.GET)
	public ModelAndView chooseEx02() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("dynamicQuery/dynamicQueryList");
		mv.addObject("orderMapList", "-");
		
		return mv;
	}
	
	
	
}
