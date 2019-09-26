package com.cafe24.oneteammds.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.GumcheService;
import com.cafe24.oneteammds.vo.Gumche;
import com.cafe24.oneteammds.vo.Yakmul;




@Controller
public class GumcheController {

	@Autowired
	private GumcheService gumcheService;
	
	// 병원
	@RequestMapping("/gumchehList")
	public String getGumcheList(Model model) {
		
		model.addAttribute("gumchehList", gumcheService.getGumchehList());
		
		return "/gumche/gumcheh/gumchehList";
	}
	
	@GetMapping("/gumcheRegist") 
	public String getGumchehById(@RequestParam(value="patientId")String patientId 
			                   , Model model) {
	  
	  model.addAttribute("gumcheh", gumcheService.getGumchehById(patientId));
	  
	  return "gumche/gumcheRegist/gumcheRegist"; }
	  
	  // 시스템DB
	  
	@PostMapping("/gumchedbList") 
	public String getGumcheRegist(Gumche gumche, Model model) { 
		  
		gumcheService.getGumcheRegist(gumche);
		  
		model.addAttribute("gumchedbList", gumcheService.getGumchedbList()); 
		
		return "/gumche/gumche/gumchedbList"; 
	}
	
	//MDS 진료 리스트- 진단내역
	@GetMapping("/gumchedbList")
	public String getYakmuldbList(Model model) {
		List<Gumche> list = gumcheService.getGumchedbList();
		
		model.addAttribute("gumchedbList", list);
		return "/gumche/gumche/gumchedbList";
	}
	 
	 
}
