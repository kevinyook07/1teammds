package com.cafe24.oneteammds.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.GinuengService;
import com.cafe24.oneteammds.vo.Ginueng;
import com.cafe24.oneteammds.vo.Yakmul;




@Controller
public class GinuengController {

	@Autowired
	private GinuengService ginuengService;
	
	// 병원
	@RequestMapping("/ginuenghList")
	public String getGinuengList(Model model) {
		
		model.addAttribute("ginuenghList", ginuengService.getGinuenghList());
		
		return "/ginueng/ginuengh/ginuenghList";
	}
	
	@GetMapping("/ginuengRegist") 
	public String getGinuenghById(@RequestParam(value="patientId")String patientId 
			                   , Model model) {
	  
	  model.addAttribute("ginuengh", ginuengService.getGinuenghById(patientId));
	  
	  return "ginueng/ginuengRegist/ginuengRegist"; }
	  
	  // 시스템DB
	  
	@PostMapping("/ginuengdbList") 
	public String getGinuengRegist(Ginueng ginueng, Model model) { 
		  
		ginuengService.getGinuengRegist(ginueng);
		  
		model.addAttribute("ginuengdbList", ginuengService.getGinuengdbList()); 
		
		return "/ginueng/ginueng/ginuengdbList"; 
	}
	
	//MDS 진료 리스트- 진단내역
	@GetMapping("/ginuengdbList")
	public String getGinuengdbList(Model model) {
		List<Ginueng> list = ginuengService.getGinuengdbList();
		
		model.addAttribute("ginuengdbList", list);
		return "/ginueng/ginueng/ginuengdbList";			
	}
	 
	 
}
