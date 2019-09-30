package com.cafe24.oneteammds.hcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.hservice.AllergyhA_Service;
import com.cafe24.oneteammds.vo.Allergyh;

@Controller
public class AllergyhA_Controller {

	@Autowired
	private AllergyhA_Service allergyhA_Service;

	// 병원
	@RequestMapping("/allergyhA_List")
	public String getAllergyhA_List(Model model) {

		
		
		 model.addAttribute("allergyhA_List", allergyhA_Service.getAllergyhA_List());
		
		
		return "/allergy/allergyh/allergyhA_List";
	}

	@GetMapping("/allergyhA_Regist")
	public String getAllergyhA_ById(@RequestParam(value = "patientId") String patientId, Model model) {

		model.addAttribute("allergyh", allergyhA_Service.getAllergyhA_ById(patientId));

		return "allergy/allergyRegist/allergyhA_Regist";
	}
	@PostMapping("/allergyhA_List")
	public String getAllergyhA_SearchList1(@RequestParam(value = "sk1") String sk1, @RequestParam(value = "sv1") String sv1,
			Model model) {
		
		List<Allergyh> list = allergyhA_Service.getAllergyhA_SearchList1(sk1, sv1);
		model.addAttribute("allergyhA_List", list);

		return "/allergy/allergyh/allergyhA_List";
	}
}
