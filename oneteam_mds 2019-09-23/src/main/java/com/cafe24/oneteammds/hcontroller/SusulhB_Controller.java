package com.cafe24.oneteammds.hcontroller;

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
public class SusulhB_Controller {

	@Autowired
	private SusulService susulhService;

	// 병원
	@RequestMapping("/susulhB_List")
	public String getSusulList(Model model) {

		model.addAttribute("susulhList", susulhService.getSusulhList());

		return "/susul/susulh/susulhB_List";
	}

	@GetMapping("/susulhB_Regist")
	public String getSusulhById(@RequestParam(value = "patientId") String patientId, Model model) {

		model.addAttribute("susulh", susulhService.getSusulhById(patientId));

		return "susul/susulRegist/susulhB_Regist";
	}

	@PostMapping("/susulhB_List")
	public String getSusulList(@RequestParam(value = "sk") String sk, @RequestParam(value = "sv") String sv,
			Model model) {
		List<Susulh> list = susulhService.getSusulSearchList(sk, sv);
		model.addAttribute("susulhList", list);

		return "/susul/susulh/susulhB_List";
	}
}
