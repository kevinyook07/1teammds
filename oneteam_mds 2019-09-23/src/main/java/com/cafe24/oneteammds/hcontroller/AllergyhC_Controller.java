package com.cafe24.oneteammds.hcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.AllergyService;
import com.cafe24.oneteammds.vo.Allergy;
import com.cafe24.oneteammds.vo.Allergyh;
import com.cafe24.oneteammds.vo.Yakmul;

@Controller
public class AllergyhC_Controller {

	@Autowired
	private AllergyService allergyhService;

	// 병원
	@RequestMapping("/allergyhC_List")
	public String getAllergyList(Model model) {

		model.addAttribute("allergyhList", allergyhService.getAllergyhList());

		return "/allergy/allergyh/allergyhC_List";
	}

	@GetMapping("/allergyhC_Regist")
	public String getAllergyhById(@RequestParam(value = "patientId") String patientId, Model model) {

		model.addAttribute("allergyh", allergyhService.getAllergyhById(patientId));

		return "allergy/allergyRegist/allergyhC_Regist";
	}
	@PostMapping("/allergyhC_List")
	public String getAllergyhList1(@RequestParam(value = "sk1") String sk1, @RequestParam(value = "sv1") String sv1,
			Model model) {
		List<Allergyh> list = allergyhService.getAllergySearchList1(sk1, sv1);
		model.addAttribute("allergyhList", list);

		return "/allergy/allergyh/allergyhC_List";
	}
}
