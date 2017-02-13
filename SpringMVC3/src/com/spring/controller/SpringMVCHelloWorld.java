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
		//��ǰ�˴���һ������
		//return new ModelAndView("/welcome","test",str);
		//��ǰ��ר��һ������
		 List<String> list=new ArrayList<String>();
		 list.add("1-001");
		 list.add("2---002");
		 list.add("3---003");
		 list.add("4---004");
		 //return new ModelAndView("/welcome2","list",list);
		//��ǰ��ר��һ��map����
		 Map<String,String> map=new HashMap<String, String>();
		 map.put("001", "test001");
		 map.put("002", "test002");
		 map.put("003", "test003");
		 map.put("004", "test004");
		 
		return new ModelAndView("/welcome","map",map);
	}

}
