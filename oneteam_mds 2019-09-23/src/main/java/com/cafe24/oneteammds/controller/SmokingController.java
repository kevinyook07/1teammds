package com.cafe24.oneteammds.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.SmokingService;
import com.cafe24.oneteammds.vo.Smoking;
import com.cafe24.oneteammds.vo.Yakmul;




@Controller
public class SmokingController {

	@Autowired
	private SmokingService smokingService;
	
	// 병원
	@RequestMapping("/smokinghList")
	public String getSmokingList(Model model) {
		
		model.addAttribute("smokinghList", smokingService.getSmokinghList());
		
		return "/smoking/smokingh/smokinghList";
	}
	
	@GetMapping("/smokingRegist") 
	public String getSmokinghById(@RequestParam(value="patientId")String patientId 
			                   , Model model) {
	  
	  model.addAttribute("smokingh", smokingService.getSmokinghById(patientId));
	  
	  return "smoking/smokingRegist/smokingRegist"; }
	  
	  // 시스템DB
	  
	@PostMapping("/smokingdbList") 
	public String getSmokingRegist(Smoking smoking, Model model) { 
		  
		smokingService.getSmokingRegist(smoking);
		  
		model.addAttribute("smokingdbList", smokingService.getSmokingdbList()); 
		
		return "/smoking/smoking/smokingdbList"; 
	}
	
	//MDS 진료 리스트- 진단내역
	@GetMapping("/smokingdbList")
	public String getSmokingdbList(Model model) {
		List<Smoking> list = smokingService.getSmokingdbList();
		
		model.addAttribute("smokingdbList", list);
		return "/smoking/smoking/smokingdbList";			
	}
	 
	 
}