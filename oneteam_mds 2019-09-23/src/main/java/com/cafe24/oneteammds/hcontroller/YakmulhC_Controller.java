package com.cafe24.oneteammds.hcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.YakmulService;
import com.cafe24.oneteammds.vo.Jindan;
import com.cafe24.oneteammds.vo.Yakmul;
import com.cafe24.oneteammds.vo.Yakmulh;

@Controller
public class YakmulhC_Controller {

	@Autowired
	private YakmulService yakmulhService;

	// 병원
	@RequestMapping("/yakmulhC_List")
	public String getYakmulList(Model model) {

		model.addAttribute("yakmulhList", yakmulhService.getYakmulhList());

		return "/yakmul/yakmulh/yakmulhC_List";
	}

	@GetMapping("/yakmulhC_Regist")
	public String getYakmulhById(@RequestParam(value = "patientId") String patientId, Model model) {

		model.addAttribute("yakmulh", yakmulhService.getYakmulhById(patientId));

		return "yakmul/yakmulRegist/yakmulhC_Regist";
	}

	@PostMapping("/yakmulhC_List")
	public String getYakmulList(@RequestParam(value = "sk") String sk, @RequestParam(value = "sv") String sv,
			Model model) {
		List<Yakmulh> list = yakmulhService.getYakmulSearchList(sk, sv);
		model.addAttribute("yakmulhList", list);

		return "/yakmul/yakmulh/yakmulhC_List";
	}
}
