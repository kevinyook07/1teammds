package com.cafe24.oneteammds.hcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.SaengchaeService;
import com.cafe24.oneteammds.vo.Saengchae;
import com.cafe24.oneteammds.vo.Saengchaeh;
import com.cafe24.oneteammds.vo.Yakmul;

@Controller
public class SaengchaehB_Controller {

	@Autowired
	private SaengchaeService saengchaehService;

	// 병원
	@RequestMapping("/saengchaehB_List")
	public String getSaengchaeList(Model model) {

		model.addAttribute("saengchaehList", saengchaehService.getSaengchaehList());

		return "/saengchae/saengchaeh/saengchaehB_List";
	}

	@GetMapping("/saengchaehB_Regist")
	public String getSaengchaehById(@RequestParam(value = "patientId") String patientId, Model model) {

		model.addAttribute("saengchaeh", saengchaehService.getSaengchaehById(patientId));

		return "saengchae/saengchaeRegist/saengchaehB_Regist";
	}

	@PostMapping("/saengchaehB_List")
	public String getSaengchaeList(@RequestParam(value = "sk") String sk, @RequestParam(value = "sv") String sv,
			Model model) {
		List<Saengchaeh> list = saengchaehService.getSaengchaeSearchList(sk, sv);
		model.addAttribute("saengchaehList", list);

		return "/saengchae/saengchaeh/saengchaehB_List";
	}
}
