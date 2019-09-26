package com.cafe24.oneteammds.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.JunyumService;
import com.cafe24.oneteammds.vo.Junyum;
import com.cafe24.oneteammds.vo.Yakmul;



@Controller
public class JunyumController {

	@Autowired
	private JunyumService junyumService;
	
	// 병원
	@RequestMapping("/junyumhList")
	public String getJunyumList(Model model) {
		
		model.addAttribute("junyumhList", junyumService.getJunyumhList());
		
		return "/junyum/junyumh/junyumhList";
	}
	
	@GetMapping("/junyumRegist") 
	public String getJunyumhById(@RequestParam(value="patientId")String patientId 
			                   , Model model) {
	  
	  model.addAttribute("junyumh", junyumService.getJunyumhById(patientId));
	  
	  return "junyum/junyumRegist/junyumRegist"; }
	  
	  // 시스템DB
	  
	@PostMapping("/junyumdbList") 
	public String getJunyumRegist(Junyum junyum, Model model) { 
		  
		junyumService.getJunyumRegist(junyum);
		  
		model.addAttribute("junyumdbList", junyumService.getJunyumdbList()); 
		
		return "/junyum/junyum/junyumdbList"; 
	}
	
	
	//MDS 진료 리스트- 진단내역
	@GetMapping("/junyumdbList")
	public String getJunyumdbList(Model model) {
		List<Junyum> list = junyumService.getJunyumdbList();
		
		model.addAttribute("junyumdbList", list);
		return "/junyum/junyum/junyumdbList";			
	}
	 
	 
}
