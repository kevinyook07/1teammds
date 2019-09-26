package com.cafe24.oneteammds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.YakmulService;
import com.cafe24.oneteammds.vo.Jindan;
import com.cafe24.oneteammds.vo.Yakmul;


@Controller
public class YakmulController {

	@Autowired
	private YakmulService yakmulService;
	
	// 병원
		@RequestMapping("/yakmulhList")
		public String getYakmulList(Model model) {
			
			model.addAttribute("yakmulhList", yakmulService.getYakmulhList());
			
			return "/yakmul/yakmulh/yakmulhList";
		}
		
		@GetMapping("/yakmulRegist") 
		public String getYakmulhById(@RequestParam(value="patientId")String patientId 
				                   , Model model) {
		  
		  model.addAttribute("yakmulh", yakmulService.getYakmulhById(patientId));
		  
		  return "yakmul/yakmulRegist/yakmulRegist"; }
		  
		  // 시스템DB
		  
		@PostMapping("/yakmuldbList") 
		public String getYakmulRegist(Yakmul yakmul, Model model) { 
			  
			yakmulService.getYakmulRegist(yakmul);
			  
			model.addAttribute("yakmuldbList", yakmulService.getYakmuldbList()); 
			
			return "/yakmul/yakmul/yakmuldbList"; 
		}
		
		
		//MDS 진료 리스트- 진단내역
		@GetMapping("/yakmuldbList")
		public String getYakmuldbList(Model model) {
			List<Yakmul> list = yakmulService.getYakmuldbList();
			
			model.addAttribute("yakmuldbList", list);
			return "/yakmul/yakmul/yakmuldbList";			
		}
}
