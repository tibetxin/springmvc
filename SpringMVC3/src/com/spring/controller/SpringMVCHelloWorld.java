package com.spring.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class SpringMVCHelloWorld implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("spring hello world");
		String str="spring hello frist lesson!";
		//向前端传送一个参数
		//return new ModelAndView("/welcome","test",str);
		//向前端专递一个集合
		 List<String> list=new ArrayList<String>();
		 list.add("1-001");
		 list.add("2---002");
		 list.add("3---003");
		 list.add("4---004");
		 //return new ModelAndView("/welcome2","list",list);
		//向前端专递一个map集合
		 Map<String,String> map=new HashMap<String, String>();
		 map.put("001", "test001");
		 map.put("002", "test002");
		 map.put("003", "test003");
		 map.put("004", "test004");
		 
		return new ModelAndView("/welcome","map",map);
	}

}
