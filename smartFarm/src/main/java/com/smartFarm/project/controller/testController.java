package com.smartFarm.project.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class testController {

	@RequestMapping(value = "/home")
	public String goHome(HttpServletRequest request) {
		return "contents/home";
	}
	
	@RequestMapping(value = "/index")
	public String goIndex(HttpServletRequest request) {
		return "contents/index";
	}
	
	@RequestMapping(value = "/main")
	public String goMain(HttpServletRequest request) {
		return "contents/main";
	}
}

