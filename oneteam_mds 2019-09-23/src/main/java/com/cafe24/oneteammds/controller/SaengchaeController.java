package com.cafe24.oneteammds.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.SaengchaeService;
import com.cafe24.oneteammds.vo.Saengchae;
import com.cafe24.oneteammds.vo.Yakmul;




@Controller
public class SaengchaeController {

	@Autowired
	private SaengchaeService saengchaeService;
	
	// 병원
	@RequestMapping("/saengchaehList")
	public String getSaengchaeList(Model model) {
		
		model.addAttribute("saengchaehList", saengchaeService.getSaengchaehList());
		
		return "/saengchae/saengchaeh/saengchaehList";
	}
	
	@GetMapping("/saengchaeRegist") 
	public String getSaengchaehById(@RequestParam(value="patientId")String patientId 
			                   , Model model) {
	  
	  model.addAttribute("saengchaeh", saengchaeService.getSaengchaehById(patientId));
	  
	  return "saengchae/saengchaeRegist/saengchaeRegist"; }
	  
	  // 시스템DB
	  
	@PostMapping("/saengchaedbList") 
	public String getSaengchaeRegist(Saengchae saengchae, Model model) { 
		  
		saengchaeService.getSaengchaeRegist(saengchae);
		  
		model.addAttribute("saengchaedbList", saengchaeService.getSaengchaedbList()); 
		
		return "/saengchae/saengchae/saengchaedbList"; 
	}
	
	
	//MDS 진료 리스트- 진단내역
	@GetMapping("/saengchaedbList")
	public String getSaengchaedbList(Model model) {
		List<Saengchae> list = saengchaeService.getSaengchaedbList();
		
		model.addAttribute("saengchaedbList", list);
		return "/saengchae/saengchae/saengchaedbList";			
	}
	 
	 
}
