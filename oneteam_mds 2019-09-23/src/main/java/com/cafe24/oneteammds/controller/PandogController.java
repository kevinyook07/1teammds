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

	// 병원
	@RequestMapping("/pandoghList")
	public String getPandogList(Model model) {

		model.addAttribute("pandoghList", pandogService.getPandoghList());

		return "/pandog/pandogh/pandoghList";
	}

	@GetMapping("/pandogRegist")
	public String getPandoghById(@RequestParam(value = "patientId") String patientId, Model model) {

		model.addAttribute("pandogh", pandogService.getPandoghById(patientId));

		return "pandog/pandogRegist/pandogRegist";
	}

	// 시스템DB

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

	@PostMapping("/pandoghList")
	public String getPandogList(@RequestParam(value = "sk") String sk, @RequestParam(value = "sv") String sv,
			Model model) {
		List<Pandogh> list = pandogService.getPandogSearchList(sk, sv);
		model.addAttribute("pandoghList", list);

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
