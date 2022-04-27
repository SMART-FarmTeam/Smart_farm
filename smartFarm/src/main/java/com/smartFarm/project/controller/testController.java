package com.smartFarm.project.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.smartFarm.project.model.smartFarm.SmartFarmRepository;
import com.smartFarm.project.model.smartFarm.SmartFarmVo;
import com.smartFarm.project.service.SmartFarmService;

@Controller
public class testController {

	@Autowired
	SmartFarmRepository smartFarmRepository;
	
	@Autowired
	SmartFarmService smartFarmService;

	ModelAndView mav;


	@RequestMapping(value = "/home")
	public ModelAndView goMain(HttpServletRequest request, @RequestParam String menu) {
		mav = smartFarmService.movePage(mav, menu);
		return mav;
	}
}
