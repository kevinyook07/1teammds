package com.cafe24.oneteammds.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.SusulService;
import com.cafe24.oneteammds.vo.Susul;
import com.cafe24.oneteammds.vo.Yakmul;




@Controller
public class SusulController {

	@Autowired
	private SusulService susulService;
	
	// 병원
	@RequestMapping("/susulhList")
	public String getSusulList(Model model) {
		
		model.addAttribute("susulhList", susulService.getSusulhList());
		
		return "/susul/susulh/susulhList";
	}
	
	@GetMapping("/susulRegist") 
	public String getSusulhById(@RequestParam(value="patientId")String patientId 
			                   , Model model) {
	  
	  model.addAttribute("susulh", susulService.getSusulhById(patientId));
	  
	  return "susul/susulRegist/susulRegist"; }
	  
	  // 시스템DB
	  
	@PostMapping("/susuldbList") 
	public String getSusulRegist(Susul susul, Model model) { 
		  
		susulService.getSusulRegist(susul);
		  
		model.addAttribute("susuldbList", susulService.getSusuldbList()); 
		
		return "/susul/susul/susuldbList"; 
	}
	
	//MDS 진료 리스트- 진단내역
	@GetMapping("/susuldbList")
	public String getSusuldbList(Model model) {
		List<Susul> list = susulService.getSusuldbList();
		
		model.addAttribute("susuldbList", list);
		return "/susul/susul/susuldbList";			
	}
	 
	 
}
