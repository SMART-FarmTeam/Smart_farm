package com.smartFarm.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.smartFarm.project.model.smartFarm.SmartFarmRepository;
import com.smartFarm.project.model.smartFarm.SmartFarmVo;


@Service
public class SmartFarmService {
	
	@Autowired
	SmartFarmRepository smartFarmRepository;
	
	
	public ModelAndView movePage (ModelAndView mav, String menu){
		mav=new ModelAndView();
		SmartFarmVo entity = smartFarmRepository.findById((String) "lsm878").get();
		mav.addObject("id", entity.getUser_id());
		mav.addObject("corp", entity.getCrop_species());
		mav.addObject("menu", menu);
		mav.setViewName("contents/main");
		return mav;
	}
}
