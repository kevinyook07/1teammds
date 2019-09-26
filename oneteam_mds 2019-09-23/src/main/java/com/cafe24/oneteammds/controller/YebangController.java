package com.cafe24.oneteammds.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.YebangService;
import com.cafe24.oneteammds.vo.Yakmul;
import com.cafe24.oneteammds.vo.Yebang;




@Controller
public class YebangController {

	@Autowired
	private YebangService yebangService;
	
	// 병원
	@RequestMapping("/yebanghList")
	public String getYebangList(Model model) {
		
		model.addAttribute("yebanghList", yebangService.getYebanghList());
		
		return "/yebang/yebangh/yebanghList";
	}
	
	@GetMapping("/yebangRegist") 
	public String getYebanghById(@RequestParam(value="patientId")String patientId 
			                   , Model model) {
	  
	  model.addAttribute("yebangh", yebangService.getYebanghById(patientId));
	  
	  return "yebang/yebangRegist/yebangRegist"; }
	  
	  // 시스템DB
	  
	@PostMapping("/yebangdbList") 
	public String getYebangRegist(Yebang yebang, Model model) { 
		  
		yebangService.getYebangRegist(yebang);
		  
		model.addAttribute("yebangdbList", yebangService.getYebangdbList()); 
		
		return "/yebang/yebang/yebangdbList"; 
	}
	
	//MDS 진료 리스트- 진단내역
	@GetMapping("/yebangdbList")
	public String getYebangdbList(Model model) {
		List<Yebang> list = yebangService.getYebangdbList();
		
		model.addAttribute("yebangdbList", list);
		return "/yebang/yebang/yebangdbList";			
	}
	 
	 
}