package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

//一个controller实现多个方法
public class MutliController extends MultiActionController {
	 // 方法必须要传入HttpServletRequest request,HttpServletResponse respones，不然会报错
	public ModelAndView add(HttpServletRequest request,HttpServletResponse respones ){
		System.out.println("------add-----");
		
		return new ModelAndView("/multi","test","this is add ");
	}

	public ModelAndView update(HttpServletRequest request,HttpServletResponse respones ){
		
		System.out.println("------update-----");
		
		return new ModelAndView("/multi","test","this is update ");
	}
}
