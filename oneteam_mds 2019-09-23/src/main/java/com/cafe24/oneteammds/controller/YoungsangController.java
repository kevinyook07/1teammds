package com.cafe24.oneteammds.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.YoungsangService;
import com.cafe24.oneteammds.vo.Yakmul;
import com.cafe24.oneteammds.vo.Youngsang;




@Controller
public class YoungsangController {

	@Autowired
	private YoungsangService youngsangService;
	
	// 병원
	@RequestMapping("/youngsanghList")
	public String getYoungsangList(Model model) {
		
		model.addAttribute("youngsanghList", youngsangService.getYoungsanghList());
		
		return "/youngsang/youngsangh/youngsanghList";
	}
	
	@GetMapping("/youngsangRegist") 
	public String getYoungsanghById(@RequestParam(value="patientId")String patientId 
			                   , Model model) {
	  
	  model.addAttribute("youngsangh", youngsangService.getYoungsanghById(patientId));
	  
	  return "youngsang/youngsangRegist/youngsangRegist"; }
	  
	  // 시스템DB
	  
	@PostMapping("/youngsangdbList") 
	public String getYoungsangRegist(Youngsang youngsang, Model model) { 
		  
		youngsangService.getYoungsangRegist(youngsang);
		  
		model.addAttribute("youngsangdbList", youngsangService.getYoungsangdbList()); 
		
		return "/youngsang/youngsang/youngsangdbList"; 
	}
	
	//MDS 진료 리스트- 진단내역
	@GetMapping("/youngsangdbList")
	public String getYoungsangdbList(Model model) {
		List<Youngsang> list = youngsangService.getYoungsangdbList();
		
		model.addAttribute("youngsangdbList", list);
		return "/youngsang/youngsang/youngsangdbList";			
	}
	 
	 
}
