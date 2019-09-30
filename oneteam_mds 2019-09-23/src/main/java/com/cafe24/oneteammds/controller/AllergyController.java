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
