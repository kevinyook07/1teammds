package com.cafe24.oneteammds.hcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.GumcheService;
import com.cafe24.oneteammds.vo.Gumche;
import com.cafe24.oneteammds.vo.Gumcheh;
import com.cafe24.oneteammds.vo.Yakmul;

@Controller
public class GumchehC_Controller {

	@Autowired
	private GumcheService gumchehService;

	// 병원
	@RequestMapping("/gumchehC_List")
	public String getGumcheList(Model model) {

		model.addAttribute("gumchehList", gumchehService.getGumchehList());

		return "/gumche/gumcheh/gumchehC_List";
	}

	@GetMapping("/gumchehC_Regist")
	public String getGumchehById(@RequestParam(value = "patientId") String patientId, Model model) {

		model.addAttribute("gumcheh", gumchehService.getGumchehById(patientId));

		return "gumche/gumcheRegist/gumchehC_Regist";
	}

	@PostMapping("/gumchehC_List")
	public String getGumcheList(@RequestParam(value = "sk") String sk, @RequestParam(value = "sv") String sv,
			Model model) {
		List<Gumcheh> list = gumchehService.getGumcheSearchList(sk, sv);
		model.addAttribute("gumchehList", list);

		return "/gumche/gumcheh/gumchehC_List";

	}
}
