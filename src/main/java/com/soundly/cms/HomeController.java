package com.soundly.cms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@Autowired
	TestDao dao;
	
	@RequestMapping(value = "/123", method = RequestMethod.GET)
	@ResponseBody
	public TestDTO home1() {
		System.out.println(dao.sel());
		return dao.sel();
	}

	@RequestMapping(value = "/")
	public String home(){
		return "home";
	}
}
