package com.cafe24.oneteammds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.PandogService;
import com.cafe24.oneteammds.vo.Pandog;
import com.cafe24.oneteammds.vo.Pandogh;
import com.cafe24.oneteammds.vo.Yakmul;

@Controller
public class PandogController {

	@Autowired
	private PandogService pandogService;

	@PostMapping("/pandogdbList")
	public String getPandogRegist(Pandog pandog, Model model) {

		pandogService.getPandogRegist(pandog);

		model.addAttribute("pandogdbList", pandogService.getPandogdbList());

		return "/pandog/pandog/pandogdbList";
	}

	// MDS 진료 리스트- 진단내역
	@GetMapping("/pandogdbList")
	public String getPandogdbList(Model model) {
		List<Pandog> list = pandogService.getPandogdbList();

		model.addAttribute("pandogdbList", list);
		return "/pandog/pandogh/pandoghList";
	}
	@GetMapping("/delPandog")
	public String delPandog(@RequestParam(value = "iidCode") String iidCode, Model model) {
		model.addAttribute("iidCode", iidCode);

		return "pandog/pdelete/delPandog";
	}

	@PostMapping("/delPandog")
	public String delPandog(@RequestParam(value = "iidCode") String iidCode,
			@RequestParam(value = "hospitalId") String hospitalId, @RequestParam(value = "patientId") String patientId,
			Model model) {
		int result = pandogService.delPandog(iidCode, hospitalId, patientId);
		if (result == 0) {
			model.addAttribute("result", "비밀번호가 일치하지 않습니다..");
			model.addAttribute("iidCode", iidCode);
			return "/pandog/pdelete/delPandog";
		}
		return "redirect:/pandogList";
	}
}
