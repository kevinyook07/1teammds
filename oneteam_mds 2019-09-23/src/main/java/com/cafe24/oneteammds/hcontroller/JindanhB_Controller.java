package com.cafe24.oneteammds.hcontroller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.JindanService;
import com.cafe24.oneteammds.vo.Jindan;
import com.cafe24.oneteammds.vo.Jindanh;

@Controller
public class JindanhB_Controller {

	@Autowired
	private JindanService jindanhService;

	// 병원
	@RequestMapping("/jindanhB_List")
	public String getJindanList(Model model) {

		model.addAttribute("jindanhList", jindanhService.getJindanhList());

		return "/jindan/jindanh/jindanhB_List";
	}

	@GetMapping("/jindanhB_Regist")
	public String getJindanhById(@RequestParam(value = "patientId") String patientId, Model model) {
		model.addAttribute("jindanh", jindanhService.getJindanhById(patientId));
		return "/jindan/jindanRegist/jindanhB_Regist";
	}

	@PostMapping("/jindanhB_List")
	public String getJindanList(@RequestParam(value = "sk") String sk, @RequestParam(value = "sv") String sv,
			Model model) {
		List<Jindanh> list = jindanhService.getJindanSearchList(sk, sv);
		model.addAttribute("jindanhList", list);

		return "/jindan/jindanh/jindanhB_List";
	}
}
