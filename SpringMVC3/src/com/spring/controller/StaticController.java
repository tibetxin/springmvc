package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public class StaticController extends MutliController {
	
	public ModelAndView staticFileImage(HttpServletRequest request ,HttpServletResponse response){
		return new ModelAndView("/staticfileimage","staticfile","Õº∆¨∂¡»°");
	}
	
	public ModelAndView staticFileJquery(HttpServletRequest request ,HttpServletResponse response){
		return new ModelAndView("/staticfilejquery","staticfile","js∂¡»°");
	}
}
