package com.cafe24.oneteammds.hcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.JunyumService;
import com.cafe24.oneteammds.vo.Junyum;
import com.cafe24.oneteammds.vo.Junyumh;
import com.cafe24.oneteammds.vo.Yakmul;

@Controller
public class JunyumhB_Controller {

	@Autowired
	private JunyumService junyumhService;

	// 병원
	@RequestMapping("/junyumhB_List")
	public String getJunyumList(Model model) {

		model.addAttribute("junyumhList", junyumhService.getJunyumhList());

		return "/junyum/junyumh/junyumhB_List";
	}

	@GetMapping("/junyumhB_Regist")
	public String getJunyumhById(@RequestParam(value = "patientId") String patientId, Model model) {

		model.addAttribute("junyumh", junyumhService.getJunyumhById(patientId));

		return "junyum/junyumRegist/junyumhB_Regist";
	}

	@PostMapping("/junyumhB_List")
	public String getJunyumList(@RequestParam(value = "sk") String sk, @RequestParam(value = "sv") String sv,
			Model model) {
		List<Junyumh> list = junyumhService.getJunyumSearchList(sk, sv);
		model.addAttribute("junyumhList", list);

		return "/junyum/junyumh/junyumhB_List";
	}
}
