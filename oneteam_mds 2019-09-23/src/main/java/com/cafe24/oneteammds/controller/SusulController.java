package com.cafe24.oneteammds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.SusulService;
import com.cafe24.oneteammds.vo.Susul;
import com.cafe24.oneteammds.vo.Susulh;
import com.cafe24.oneteammds.vo.Yakmul;

@Controller
public class SusulController {

	@Autowired
	private SusulService susulService;

	@PostMapping("/susuldbList")
	public String getSusulRegist(Susul susul, Model model) {

		susulService.getSusulRegist(susul);

		model.addAttribute("susuldbList", susulService.getSusuldbList());

		return "/susul/susul/susuldbList";
	}

	// MDS 진료 리스트- 진단내역
	@GetMapping("/susuldbList")
	public String getSusuldbList(Model model) {
		List<Susul> list = susulService.getSusuldbList();

		model.addAttribute("susuldbList", list);
		return "/susul/susul/susuldbList";
	}
	@GetMapping("/delSusul")
	public String delSusul(@RequestParam(value = "sbCode") String sbCode, Model model) {
		model.addAttribute("sbCode", sbCode);

		return "susul/sdelete/delSusul";
	}

	@PostMapping("/delSusul")
	public String delSusul(@RequestParam(value = "sbCode") String sbCode,
			@RequestParam(value = "hospitalId") String hospitalId, @RequestParam(value = "patientId") String patientId,
			Model model) {
		int result = susulService.delSusul(sbCode, hospitalId, patientId);
		if (result == 0) {
			model.addAttribute("result", "비밀번호가 일치하지 않습니다..");
			model.addAttribute("sbCode", sbCode);
			return "/susul/sdelete/delSusul";
		}
		return "redirect:/susulList";
	}

}
