package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

//һ��controllerʵ�ֶ������
public class MutliController extends MultiActionController {
	 // ��������Ҫ����HttpServletRequest request,HttpServletResponse respones����Ȼ�ᱨ��
	public ModelAndView add(HttpServletRequest request,HttpServletResponse respones ){
		System.out.println("------add-----");
		
		return new ModelAndView("/multi","test","this is add ");
	}

	public ModelAndView update(HttpServletRequest request,HttpServletResponse respones ){
		
		System.out.println("------update-----");
		
		return new ModelAndView("/multi","test","this is update ");
	}
}
