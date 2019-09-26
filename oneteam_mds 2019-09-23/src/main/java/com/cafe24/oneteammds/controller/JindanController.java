package com.cafe24.oneteammds.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.JindanService;
import com.cafe24.oneteammds.vo.Jindan;

@Controller
public class JindanController {


	 
	 
		@Autowired
		private JindanService jindanService;
		
		// 병원
		@RequestMapping("/jindanhList")
		public String getJindanList(Model model) {
			
			model.addAttribute("jindanhList", jindanService.getJindanhList());
			
			return "/jindan/jindanh/jindanhList";
		}
		@GetMapping("/jindaninsert")
		public String getJindanhById(@RequestParam(value="patientId")String patientId 
                					, Model model) {
			model.addAttribute("jindanh", jindanService.getJindanhById(patientId));
			return "/jindan/jindanRegist/jindaninsert";
		}
		
		
		// 시스템DB		  
		@PostMapping("/jindandbList") 
		public String getJindanRegist(Jindan jindan, Model model) { 
			  
			jindanService.getJindanRegist(jindan);
			  
			model.addAttribute("jindandbList", jindanService.getJindandbList()); 
			
			return "/jindan/jindan/jindandbList"; 
		}
		
		
		
		//MDS 진료 리스트- 진단내역
		@GetMapping("/jindandbList")
		public String getJindandbList(Model model) {
			List<Jindan> list = jindanService.getJindandbList();
			
			model.addAttribute("jindandbList", list);
			return "/jindan/jindan/jindandbList";			
		}
		
		
		
		
		
		
		
		
}
