package com.cafe24.oneteammds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cafe24.oneteammds.service.HospitalService;
import com.cafe24.oneteammds.vo.Hospital;

public class HospitalController {
	
	@Autowired
	private HospitalService hospitalService;
	
	@RequestMapping("/hospitaldbList")
	public String getHospitaldbList(Model model) {
		
		List<Hospital> list = hospitalService.getHospitaldbList();
		
		model.addAttribute("hospitaldbList", list);
		
		return "/hospital/hospitalList/hospitaldbList";		
	}
	
	
	
}
