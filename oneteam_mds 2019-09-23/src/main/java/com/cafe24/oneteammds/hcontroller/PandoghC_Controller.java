package com.cafe24.oneteammds.hcontroller;

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
public class PandoghC_Controller {

	@Autowired
	private PandogService pandoghService;

	// 병원
	@RequestMapping("/pandoghC_List")
	public String getPandogList(Model model) {

		model.addAttribute("pandoghList", pandoghService.getPandoghList());

		return "/pandog/pandogh/pandoghC_List";
	}

	@GetMapping("/pandoghC_Regist")
	public String getPandoghById(@RequestParam(value = "patientId") String patientId, Model model) {

		model.addAttribute("pandogh", pandoghService.getPandoghById(patientId));

		return "pandog/pandogRegist/pandoghC_Regist";
	}

	@PostMapping("/pandoghC_List")
	public String getPandogList(@RequestParam(value = "sk") String sk, @RequestParam(value = "sv") String sv,
			Model model) {
		List<Pandogh> list = pandoghService.getPandogSearchList(sk, sv);
		model.addAttribute("pandoghList", list);

		return "/pandog/pandogh/pandoghC_List";
	}
}
