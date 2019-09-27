package com.cafe24.oneteammds.controller;

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
public class AllergyController {

	@Autowired
	private AllergyService allergyService;

	// 병원
	@RequestMapping("/allergyhList")
	public String getAllergyList(Model model) {

		model.addAttribute("allergyhList", allergyService.getAllergyhList());

		return "/allergy/allergyh/allergyhList";
	}

	@GetMapping("/allergyRegist")
	public String getAllergyhById(@RequestParam(value = "patientId") String patientId, Model model) {

		model.addAttribute("allergyh", allergyService.getAllergyhById(patientId));

		return "allergy/allergyRegist/allergyRegist";
	}

	// 시스템DB

	@PostMapping("/allergydbList")
	public String getAllergyRegist(Allergy allergy, Model model) {

		allergyService.getAllergyRegist(allergy);

		model.addAttribute("allergydbList", allergyService.getAllergydbList());

		return "/allergy/allergy/allergydbList";
	}

	// MDS 진료 리스트- 진단내역
	@GetMapping("/allergydbList")
	public String getAllergydbList(Model model) {
		List<Allergy> list = allergyService.getAllergydbList();

		model.addAttribute("allergydbList", list);
		return "/allergy/allergy/allergydbList";
	}

	@PostMapping("/allergyhList")
	public String getAllergyhList1(@RequestParam(value = "sk1") String sk1, @RequestParam(value = "sv1") String sv1,
			Model model) {
		List<Allergyh> list = allergyService.getAllergySearchList1(sk1, sv1);
		model.addAttribute("allergyhList", list);

		return "/allergy/allergyh/allergyhList";
	}
	
	
	/*
	 * @PostMapping("/allergydbList") public String
	 * getAllergydbList2(@RequestParam(value = "sk2") String
	 * sk2, @RequestParam(value = "sv2") String sv2, Model model) { List<Allergy>
	 * list = allergyService.getAllergySearchList2(sk2, sv2);
	 * model.addAttribute("allergydbList", list);
	 * 
	 * return "/allergy/allergy/allergydbList"; }
	 */
	 

	@GetMapping("/delAllergy")
	public String delAllergy(@RequestParam(value = "aseCode") String aseCode, Model model) {
		model.addAttribute("aseCode", aseCode);

		return "allergy/adelete/delAllergy";
	}

	@PostMapping("/delAllergy")
	public String delAllergy(@RequestParam(value = "aseCode") String aseCode,
			@RequestParam(value = "hospitalId") String hospitalId, @RequestParam(value = "patientId") String patientId,
			Model model) {
		int result = allergyService.delAllergy(aseCode, hospitalId, patientId);
		if (result == 0) {
			model.addAttribute("result", "비밀번호가 일치하지 않습니다.");
			model.addAttribute("aseCode", aseCode);
			return "/allergy/adelete/delAllergy";
		}
		return "redirect:/allergyList";

	}
}
