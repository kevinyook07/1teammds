package com.cafe24.oneteammds.hcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.SmokingService;
import com.cafe24.oneteammds.vo.Smoking;
import com.cafe24.oneteammds.vo.Smokingh;
import com.cafe24.oneteammds.vo.Yakmul;

@Controller
public class SmokinghB_Controller {

	@Autowired
	private SmokingService smokinghService;

	// 병원
	@RequestMapping("/smokinghB_List")
	public String getSmokingList(Model model) {

		model.addAttribute("smokinghList", smokinghService.getSmokinghList());

		return "/smoking/smokingh/smokinghB_List";
	}

	@GetMapping("/smokinghB_Regist")
	public String getSmokinghById(@RequestParam(value = "patientId") String patientId, Model model) {

		model.addAttribute("smokingh", smokinghService.getSmokinghById(patientId));

		return "smoking/smokingRegist/smokinghB_Regist";
	}
	
	@PostMapping("/smokinghB_List")
	public String getSmokingList(@RequestParam(value = "sk") String sk, @RequestParam(value = "sv") String sv,
			Model model) {
		List<Smokingh> list = smokinghService.getSmokringSearchList(sk, sv);
		model.addAttribute("smokinghList", list);

		return "/smoking/smokingh/smokinghB_List";
	}
}
