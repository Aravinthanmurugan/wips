package com.exapmle.practice.springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ctrl1")
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	@RequestMapping(value="/test")
	public ModelAndView test1(HttpServletResponse response) throws IOException{
		return new ModelAndView("test");
	}
	@RequestMapping(value="/get")
	public ModelAndView test2(HttpServletResponse response) throws IOException{
		return new ModelAndView("test1");
	}
}
